package org.usfirst.frc.team2881.robot;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;

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
	Spark motor2 = new Spark(2);
	Spark motor3 = new Spark(3);
	Spark motor4 = new Spark(4);
	Spark motor5 = new Spark(5);
	Spark motor6 = new Spark(6);
	Spark motor7 = new Spark(7);

	XboxController controller = new XboxController(0);
	
	public Robot() {
		myRobot.setExpiration(0.1);
	}

	/**
	 * Runs the motors with tank steering.
	 */
	@Override
	public void operatorControl() {
		myRobot.setSafetyEnabled(true);
		
		int beats = 0;
		while (isOperatorControl() && isEnabled()) {
			myRobot.tankDrive(controller, 1, controller, 5);
			
			if (controller.getAButton()) {
				beats = 15;  
			} else if (beats > 0) {
				motor5.set(1);
			} else {
		//		motor.stopMotor();
			}
			
			Timer.delay(0.005); // wait for a motor update time
		}
	}
}
