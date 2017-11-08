package org.usfirst.frc.team2881.robot.commands;

import org.usfirst.frc.team2881.robot.subsystems.*;
import org.usfirst.frc.team2881.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;



import java.util.function.DoubleSupplier;

public class ClimbWithJoystick extends Command {
    private final DoubleSupplier joystick = Robot.oi.climbJoystick;
    private final Climber climber = Robot.climber;

    public ClimbWithJoystick() {
        requires(climber);
    }

    @Override
    protected void execute() {
        climber.climb(joystick.getAsDouble());
    }

    @Override
    protected boolean isFinished() {
        return false;  // Run forever unless interrupted
    }

    @Override
    protected void end() {
        climber.climb(0);
    }
}
