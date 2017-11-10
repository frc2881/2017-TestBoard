package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import org.usfirst.frc.team2881.robot.Robot;
import org.usfirst.frc.team2881.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2881.robot.subsystems.DriveTrain.Flip;

/*Makes it easy to flip orientaition from driving forward to backwards*/


public class FlipBackward extends InstantCommand {
    private final DriveTrain driveTrain = Robot.driveTrain;

    @Override
    protected void initialize() {
        driveTrain.setFlip(Flip.FACE_BACKWARD);
    }
}
