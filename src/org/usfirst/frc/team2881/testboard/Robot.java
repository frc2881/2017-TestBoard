package org.usfirst.frc.team2881.testboard;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
//	RobotDrive myRobot = new RobotDrive(0, 1); // class that handles basic drive

    SpeedController spark0 = new Spark(0);
    SpeedController spark1 = new Spark(1);
    SpeedController spark2 = new Spark(2);
    SpeedController spark3 = new Spark(3);
    SpeedController spark4 = new Spark(4);
    SpeedController spark5 = new Spark(5);
    SpeedController spark6 = new Spark(6);
    SpeedController spark7 = new Spark(7);  // doesn't work!
    SpeedController talon0 = new CANTalon(0);
    SpeedController talon1 = new CANTalon(1);
    SpeedController talon2 = new CANTalon(2);
    SpeedController talon3 = new CANTalon(3);
    SpeedController talon4 = new CANTalon(4);
    SpeedController talon5 = new CANTalon(5);
//    Encoder encoder0 = new Encoder(0, 1, false, EncodingType.k1X);
 												// operations
	XboxController stick = new XboxController(0); // set to ID 1 in DriverStation

	public Robot() {
//		myRobot.setExpiration(0.1);
	}

	/**
	 * Runs the motors with tank steering.
	 */
	@Override
	public void operatorControl() {
//	    motor1.setInverted(true);
//	    motor3.setInverted(true);
//	    encoder0.setMinRate(0);
//	    encoder0.setDistancePerPulse(5);
//	    encoder0.setSamplesToAverage(7);

//		myRobot.setSafetyEnabled(true);
		while (isOperatorControl() && isEnabled()) {
//			myRobot.tankDrive(stick, 1, stick, 5);

            spark0.set(stick.getX(Hand.kLeft));
            spark1.set(stick.getY(Hand.kLeft));
            spark2.set(stick.getX(Hand.kRight));
            spark3.set(stick.getY(Hand.kRight));
            talon4.set(stick.getTriggerAxis(Hand.kLeft));
            talon5.set(stick.getTriggerAxis(Hand.kRight));
//            motor6.set(stick.getPOV() / (45 * 7.0));
//            motor7.set((stick.getAButton() ? 1 : 0) + (stick.getYButton() ? -1 : 0));

            stick.setRumble(GenericHID.RumbleType.kLeftRumble, stick.getTriggerAxis(Hand.kLeft));
            stick.setRumble(GenericHID.RumbleType.kRightRumble, stick.getTriggerAxis(Hand.kRight));

//            SmartDashboard.putNumber("Encoder Distance", encoder0.getDistance());
//            SmartDashboard.putNumber("Encoder Rate", encoder0.getRate());
//            SmartDashboard.putBoolean("Encoder Stopped", encoder0.getStopped());
//            SmartDashboard.putNumber("Encoder Raw", encoder0.getRaw());

			Timer.delay(0.005); // wait for a motor update time
		}
	}
}
