package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import org.usfirst.frc.team2881.robot.Robot;
import org.usfirst.frc.team2881.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2881.robot.subsystems.DriveTrain.Flip;

public class FlipForward extends InstantCommand {
    private final DriveTrain driveTrain = Robot.driveTrain;

    @Override
    protected void initialize() {
        driveTrain.setFlip(Flip.FACE_FORWARD);
    }
}
