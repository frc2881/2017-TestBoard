package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;

import org.usfirst.frc.team2881.robot.Robot;
import org.usfirst.frc.team2881.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2881.robot.utils.AmpMonitor;

import static org.usfirst.frc.team2881.robot.Robot.robotMap;

/**
 * Autonomous command drives forward for a few seconds at half speed in low gear.
 */
public class DrivePastLine extends TimedCommand {
    private static final double DURATION = 15;  // seconds
    private static final double CURRENT_SAFETY_THRESHOLD = 20;  // current in amps

    private final DriveTrain driveTrain = Robot.driveTrain;  //gets a handle on the DriveTrain subsystem initialized in Robot.java
    private final AmpMonitor ampMonitor;

    public DrivePastLine() {
        super(DURATION);  		//Calls TimedCommand (parent class) with a time set by DURATION
        requires(driveTrain);	//Ensures only one action is happening to DriveTrain subsystem at a time

        // Stop the robot if it seems like we've hit something
        ampMonitor = new AmpMonitor(CURRENT_SAFETY_THRESHOLD, robotMap.pdp::getTotalCurrent);
    }

    @Override
    protected void initialize() {
        driveTrain.lowGear();				//ensure that we always start in low gear
        ampMonitor.reset();					//ensure that ampMonitor is reset from previous
    }

    @Override
    protected void execute() {
        driveTrain.tankDrive(0.5, 0.5);		//sets the speed for this autonomous mode command at half power
    }

    @Override
    protected boolean isFinished() {
        return super.isFinished() || ampMonitor.checkTriggered();
    }
}
