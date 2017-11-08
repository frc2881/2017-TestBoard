
package org.usfirst.frc.team2881.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.NamedSendable;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2881.robot.OI;
import org.usfirst.frc.team2881.robot.RobotMap;
import org.usfirst.frc.team2881.robot.commands.DrivePastLine;
import org.usfirst.frc.team2881.robot.commands.InitializePneumatics;
import org.usfirst.frc.team2881.robot.subsystems.Climber;
import org.usfirst.frc.team2881.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2881.robot.subsystems.GearPouch;
import org.usfirst.frc.team2881.robot.subsystems.Pneumatics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	 private static final boolean SMART_DASHBOARD = false;

	    public static RobotMap robotMap;
	    public static OI oi;

	    // Subsystems
	    public static Pneumatics pneumatics;
	    public static DriveTrain driveTrain;
	    public static GearPouch gearPouch;
	    public static Climber climber;

	    private Supplier<Command> autonomousChooser;
	    private Command autonomousCommand;
	    
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
        // Setup low-level hardware and controls
        robotMap = new RobotMap();
        oi = new OI();

        // Setup subsystems composed of devices
        pneumatics = register(new Pneumatics());
        driveTrain = register(new DriveTrain());
        gearPouch = register(new GearPouch());
        climber = register(new Climber());

        // Wire controls to subsystems
        oi.initCommands();

        SmartDashboard.putData(pneumatics);
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(gearPouch);
        SmartDashboard.putData(climber);

        // Which program should be run in autonomous mode?
        autonomousChooser = configureAutonomousMenu();

        // Send USB webcam video to the driver Dashboard
        //CameraServer.getInstance().startAutomaticCapture();
        //CameraServer.getInstance().addAxisCamera("axis-camera.local");

        // Once the compressor is ready, move all the pistons to the desired initial state
        new InitializePneumatics().start();
    }
	 /** Report component status back to the dashboard. */
    private <T extends NamedSendable> T register(T component) {
        SmartDashboard.putData(component);
        return component;
    }
    /**
     * Interfaces with the Java SmartDashboard or LabVIEW Dashboard to choose the command to run in autonomous mode.
     */
    private Supplier<Command> configureAutonomousMenu() {
        // Build the menu of commands.  If LabVIEW Dashboard then it must be programmed with the same menu.
        Map<String, Command> commands = new LinkedHashMap<>();
        commands.put("Drive Past Line", new DrivePastLine());
        commands.put("Disabled", new InstantCommand());

        // Assume the first menu option is the default
        Map.Entry<String, Command> defaultEntry = commands.entrySet().iterator().next();

        if (SMART_DASHBOARD) {
            // Java SmartDashboard
            SendableChooser<Command> chooser = new SendableChooser<>();
            commands.forEach((name, command) -> {
                if (name.equals(defaultEntry.getKey())) {
                    chooser.addDefault(name, command);
                } else {
                    chooser.addObject(name, command);
                }
            });
            SmartDashboard.putData("Auto mode", chooser);
            return chooser::getSelected;
        } else {
            // LabVIEW Dashboard options are configured in LabVIEW
            return () -> {
                String selected = SmartDashboard.getString("Auto Selector", null);
                return commands.getOrDefault(selected, defaultEntry.getValue());
            };
        }
    }
	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
		if (autonomousCommand != null) {
            autonomousCommand.cancel();
        }
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autonomousCommand = autonomousChooser.get();
        autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		log();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
	 /**
     * The log method puts interesting information to the SmartDashboard.
     */
    private void log() {
        SmartDashboard.putNumber("Total Current", robotMap.pdp.getTotalCurrent());
        pneumatics.log();
        driveTrain.log();
        gearPouch.log();
        climber.log();
    }
}
