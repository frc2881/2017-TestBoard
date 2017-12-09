package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team2881.robot.RobotMap;

/**
 * Autonomous command drives forward for a few seconds at half speed in low gear.
 */
public class RunTestBoard2Components extends CommandGroup {

    public RunTestBoard2Components() {
        addSequential(new RunMotor(RobotMap.spark0, 1, -.50));
        addSequential(new RunMotor(RobotMap.spark1, .50, .50));
        addSequential(new RunMotor(RobotMap.spark0, .50, .50));
        addSequential(new RunMotor(RobotMap.spark1, 1, -.50));

        addSequential(new RunMotor(RobotMap.spark1, 1, -.50));
        addSequential(new RunMotor(RobotMap.spark2, .50, .50));
        addSequential(new RunMotor(RobotMap.spark1, .50, .50));
        addSequential(new RunMotor(RobotMap.spark2, .1, -.50));

        addSequential(new RunMotor(RobotMap.spark3, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark3, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, -0.5));

        addSequential(new RunMotor(RobotMap.spark3, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark0, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark0, 1, -0.5));

        addSequential(new RunMotor(RobotMap.spark4, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark5, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, .50, 0.5));

        addSequential(new RunMotor(RobotMap.spark5, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark6, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, .50, 0.5));

        addSequential(new RunMotor(RobotMap.spark6, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark7, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, .50, 0.5));

        addSequential(new RunMotor(RobotMap.spark7, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark0, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark0, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, -0.5));

        addSequential(new RunMotor(RobotMap.spark7, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .50, 0.5));

        addSequential(new RunMotor(RobotMap.spark3, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, .50, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark0, 1, -0.5));



        //addSequential(new RunMotor(RobotMap.spark0, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.spark1, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.spark2, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.spark3, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.spark4, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.spark5, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.spark6, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.spark7, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.talon0, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.talon1, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.talon2, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.talon3, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.talon4, 2, 0.5));
        //addSequential(new RunMotor(RobotMap.talon5, 2, 0.5));
    }
}
