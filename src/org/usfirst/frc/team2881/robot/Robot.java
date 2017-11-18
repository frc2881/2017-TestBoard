package org.usfirst.frc.team2881.robot;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Spark;
import org.usfirst.frc.team2881.subsystems.ExpoMotor;


/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SampleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *
 * WARNING: While it may look like a good choice to use for your code if you're
 * inexperienced, don't. Unless you know what you are doing, complex code will
 * be much more difficult under this system. Use IterativeRobot or Command-Based
 * instead if you're new.
 */
public class Robot extends SampleRobot {
    RobotDrive myRobot = new RobotDrive(0, 1); // class that handles basic drive
    // operations
    SpeedController Chaparral = new Spark(2);
    SpeedController Ice = new Spark(3);
    XboxController QuinnExMachina = new XboxController(0); // set to ID 1 in DriverStation

    ExpoMotor expoMotor = new ExpoMotor(QuinnExMachina);

    public Robot() {
        myRobot.setExpiration(0.1);

    }

    /**
     * Runs the motors with tank steering.
     */
    @Override
    public void operatorControl() {
        myRobot.setSafetyEnabled(true);

        while (isOperatorControl() && isEnabled()) {
            myRobot.tankDrive(QuinnExMachina.getY(Hand.kLeft), QuinnExMachina.getY(Hand.kRight));
            Chaparral.set(QuinnExMachina.getTriggerAxis(Hand.kLeft));
            expoMotor.exponential(2, Ice);

            Timer.delay(0.005); // wait for a motor update time
        }
    }
}
