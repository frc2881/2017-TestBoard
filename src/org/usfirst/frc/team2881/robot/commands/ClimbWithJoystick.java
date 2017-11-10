package org.usfirst.frc.team2881.robot.commands;

import org.usfirst.frc.team2881.robot.subsystems.*;
import org.usfirst.frc.team2881.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;



import java.util.function.DoubleSupplier;

public class ClimbWithJoystick extends Command {
    private final DoubleSupplier joystick = Robot.oi.climbJoystick;  //This is the joystick assigned to the climber in oi.java
    private final Climber climber = Robot.climber;  //Robot.climber is the public subsystem object "climber" created in the Robot.java class

    public ClimbWithJoystick() {
        requires(climber);	//Makes sure the subsystem is only given one command at a time
    }

    @Override
    protected void execute() {
        climber.climb(joystick.getAsDouble()); //calls the subsystem Climber to set motor speed according to how joystick is pressed.
    }

    @Override
    protected boolean isFinished() {
        return false;  // Run forever unless interrupted
    }

    @Override
    protected void end() {
        climber.climb(0);  //turn motor off for climber
    }
}
