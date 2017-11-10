package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2881.robot.Robot;
import org.usfirst.frc.team2881.robot.subsystems.DriveTrain;

/**
 * Standard tank drive w/a pair of pair of joysticks on a gamepad-style controller.
 */
public class DriveWithJoysticks extends Command {
    private final GenericHID controller = Robot.oi.driverController;  //Gives us access to the buttons on the controller initialized in Robot.java
    private final DriveTrain driveTrain = Robot.driveTrain;			//Allows access to the DriveTrain object initialized in Robot.java
    private final boolean highGear;

    public DriveWithJoysticks() {
        this(false);
    }

    public DriveWithJoysticks(boolean highGear) {
        super(String.format("DriveIn%sGear", highGear ? "High" : "Low"));
        requires(driveTrain);
        this.highGear = highGear;
    }

    @Override
    protected void initialize() {
        if (highGear) {
            driveTrain.highGear();
        } else {
            driveTrain.lowGear();
        }
    }

    @Override
    protected void execute() {
        double left = controller.getY(Hand.kLeft);  	//gives a double value for where joystick is from -1 to 1
        double right = controller.getY(Hand.kRight);	//on both X and Y axis
        driveTrain.tankDrive(left, right);				//Tell the DriveTrain object to drive with appropriate speed based on joystick input
    }

    @Override
    protected boolean isFinished() {
        return false;  // Run forever unless interrupted
    }

    @Override
    protected void end() {
        driveTrain.lowGear();
    }
}
