package org.usfirst.frc.team2881.robot.subsystems;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import static org.usfirst.frc.team2881.robot.Robot.robotMap;


@SuppressWarnings("FieldCanBeLocal")
public class GearPouch extends Subsystem {
    private final PowerDistributionPanel pdp = robotMap.pdp;				//grab the power distribution panel from RobotMap.java so we can talk to the motors
    private final int motorPdpChannel = robotMap.gearIntakeMotorPdpChannel;	//this is the integer mapping for the channel we want to use for gear intake motor, defined in RobotMap.java
    private final SpeedController motor = robotMap.gearIntakeMotor;			//grab the speed controller for the gear intake motor, defined in RobotMap.java
    private final Solenoid piston = robotMap.gearIntakePiston;				//grab the solenoid for the intake piston, defined in RobotMap.java
    private final Timer timer = new Timer();								

    @Override
    protected void initDefaultCommand() {
        // No default command
    }

    public void resetTimer() {
        timer.reset();
        timer.start();
    }

    public double getTimer() {
        return timer.get();
    }

    public void pouchDown() {
        piston.set(true);		//set that the pouch is down in the piston Solenoid object
    }

    public void pouchUp() {
        piston.set(false);		//set that the pouch is up in the piston Solenoid object
    }

    public void intakeGear() {
        motor.set(1);			//set the motor to run forwards at full power
    }

    public void ejectGear() {
        motor.set(-0.5);		//set the motor to run backwards at half power
    }

    public void stopGearMotor() {
        motor.set(0);			//set the motor to zero power to stop it
    }

    public double getMotorCurrent() {
        return pdp.getCurrent(motorPdpChannel);	//check the current of the gear intake motor
    }

    /** The log method puts interesting information to the SmartDashboard when called from Robot.java */
    public void log() {
        SmartDashboard.putNumber("Gear Intake Motor", motor.get());
        SmartDashboard.putBoolean("Gear Intake Piston", piston.get());
        SmartDashboard.putNumber("Gear Intake Current", getMotorCurrent());
        SmartDashboard.putNumber("Gear Intake Timer", getTimer());
    }
}
