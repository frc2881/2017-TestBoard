package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.TimedCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * Autonomous command drives forward for a few seconds at half speed in low gear.
 */
public class RunMotor extends TimedCommand {

    private final SpeedController motor;
    private final double speed;

    public RunMotor(SpeedController motor, double duration, double speed) {
        super(duration);        //Calls TimedCommand (parent class) with a time set by 'duration'
        this.motor = motor;
        this.speed = speed;
    }

    @Override
    protected void initialize() {
        SmartDashboard.putNumber("Carol of the Bells(oh god no)", speed);
    }

    @Override
    protected void execute() {
        motor.set(speed);
    }


    @Override
    protected void end() {
        motor.stopMotor();
    }
}
