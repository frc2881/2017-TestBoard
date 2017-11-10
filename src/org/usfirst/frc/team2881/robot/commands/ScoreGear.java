package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2881.robot.Robot;
import org.usfirst.frc.team2881.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2881.robot.subsystems.GearPouch;

/**
 * Gear pouch strategy for hanging a gear on the peg.
 */
public class ScoreGear extends Command {

    private final GearPouch gearPouch = Robot.gearPouch;
    private final DriveTrain driveTrain = Robot.driveTrain;

    public ScoreGear() {
        requires(gearPouch);
        requires(driveTrain);
    }

    @Override
    protected void initialize() {
        gearPouch.resetTimer();
    }

    @Override
    protected void execute() {
        // Run the pouch motor backward
        gearPouch.ejectGear();

        // After a short delay, drop the pouch to leave the gear hanging on the peg
        if (gearPouch.getTimer() >= 0.250) {
            gearPouch.pouchDown();

            // Move away from the gear peg for half a second to clear the peg
            if (gearPouch.getTimer() < 0.250 + 0.500) {
                driveTrain.driveStraight(0.8);
            } else {
                driveTrain.stop();
            }
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        gearPouch.stopGearMotor();
        gearPouch.pouchUp();
    }
}
