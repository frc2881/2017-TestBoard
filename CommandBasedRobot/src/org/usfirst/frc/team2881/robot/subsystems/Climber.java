package org.usfirst.frc.team2881.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2881.robot.commands.*;
import org.usfirst.frc.team2881.robot.subsystems.*;
import org.usfirst.frc.team2881.robot.utils.*;
import static org.usfirst.frc.team2881.robot.Robot.robotMap;





public class Climber extends Subsystem {
    private final SpeedController ratchetMotor = robotMap.climberRatchetMotor;

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ClimbWithJoystick());
    }

    public void climb(double speed) {
        ratchetMotor.set(speed);
    }

    /** The log method puts interesting information to the SmartDashboard. */
    public void log() {
    }
}
