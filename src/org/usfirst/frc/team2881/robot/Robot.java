
package org.usfirst.frc.team2881.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2881.robot.commands.RunTestBoard2Components;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class                                                                                         Robot extends IterativeRobot {

    public static RobotMap robotMap;            //This is where connections to the robot are defined
    // public static OI oi;						//This is the operator inputs like controllers, etc.

    // Initialize Subsystems
    //public static Pneumatics pneumatics;		//we don't have these on the test board
    //public static DriveTrain driveTrain;		//Defines how the robot drives
    //public static GearPouch gearPouch;			//Handles all the gear pouch operations
    //public static Climber climber;				//Handles all the climber operations

    private SendableChooser<Command> autonomousChooser;  //This stores which autonomous command is selected in SmartDashboard on drivers station
    private Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        //Initialize classes in robot package that aren't automatically called by VM, like OperatorInterface (OI) and RobotMap
        //this sets up low-level hardware and controls
        robotMap = new RobotMap();
        //oi = new OI();

        // Initialize subsystems
        //pneumatics = new Pneumatics();
        //driveTrain = new DriveTrain();
        //gearPouch = new GearPouch();
        //climber = new Climber();

        // Call initCommands method which wires controls to subsystems
        //oi.initCommands();

        //Sets up SmartDashboard so subsystems will show their currently
        //running command in SmartDashboard on the drivers station
        //SmartDashboard.putData(pneumatics);
        //SmartDashboard.putData(driveTrain);
        //SmartDashboard.putData(gearPouch);
        //SmartDashboard.putData(climber);

        // Configure autonomous mode based on command selected in SmartDashboard on drivers station
        autonomousChooser = configureAutonomousMenu();

        // Send USB webcam video to the driver Dashboard
        //CameraServer.getInstance().startAutomaticCapture();
        //CameraServer.getInstance().addAxisCamera("axis-camera.local");

        // Once the compressor is ready, move all the pistons to the desired initial state
        //new InitializePneumatics().start();
    }

    /**
     * Interfaces with the Java SmartDashboard to choose the command to run in autonomous mode.
     */
    private SendableChooser<Command> configureAutonomousMenu() {
        // Build the menu of commands.
        Map<String, Command> commands = new LinkedHashMap<>();
        commands.put("Run Test Board 2 Components", new RunTestBoard2Components()); //this is where we tell Autonomous what to do
        commands.put("Disabled", new InstantCommand());

        // Assume the first menu option is the default
        Map.Entry<String, Command> defaultEntry = commands.entrySet().iterator().next();

        // Configure Java SmartDashboard
        SendableChooser<Command> chooser = new SendableChooser<>();
        commands.forEach((name, command) -> {
            if (name.equals(defaultEntry.getKey())) {
                chooser.addDefault(name, command);
            } else {
                chooser.addObject(name, command);
            }
        });
        SmartDashboard.putData("Auto mode", chooser);
        return chooser;
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
     * chooser code works with the Java SmartDashboard.
     * <p>
     * You can add additional auto modes by adding additional commands to the
     * chooser code above (like the commented example) or additional comparisons
     * to the switch structure below with additional strings & commands.
     */
    @Override
    public void autonomousInit() {
        autonomousCommand = autonomousChooser.getSelected();
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
        log();  //calls each subsystems log to update values into the SmartDashboard
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
        //SmartDashboard.putString("Controller Name", oi.controller.getName());
        //SmartDashboard.putNumber("Total Current", robotMap.pdp.getTotalCurrent());
        //pneumatics.log();
        //driveTrain.log();
        //gearPouch.log();
        //climber.log();
    }
}
