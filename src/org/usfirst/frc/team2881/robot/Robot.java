package org.usfirst.frc.team2881.robot;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Spark;


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
	

	public Robot() {
		myRobot.setExpiration(0.1);
		 
	}

	/**
	 * Runs the motors with tank steering.
	 */
	@Override
	public void operatorControl() {
		myRobot.setSafetyEnabled(true);
		
		double electron1 = 0;
		double electron2 = 1;
		double crement = .5 / 200.0;
		while (isOperatorControl() && isEnabled()) {
			myRobot.tankDrive(QuinnExMachina.getY(Hand.kLeft), QuinnExMachina.getY(Hand.kRight));
			Chaparral.set(QuinnExMachina.getTriggerAxis(Hand.kLeft));
			if (QuinnExMachina.getAButton() == true) {
				Ice.set(electron1);
				electron1 = (electron1 + crement)*(1+.75/200);
			}
			else if (QuinnExMachina.getAButton() == false && electron1 >= 1 && electron2 >0) {
				Ice.set(electron2);
				electron2 = (electron2 - crement)/(1+.75/200);
			}
			else {
				Ice.set(0);
				electron1 = 0;
				electron2 = 1;
			}
			SmartDashboard.putNumber("electron1", electron1);
			SmartDashboard.putNumber("electron2", electron2);
			Timer.delay(0.005); // wait for a motor update time
		}
	}
}
