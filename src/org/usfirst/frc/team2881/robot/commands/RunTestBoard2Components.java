package org.usfirst.frc.team2881.robot.commands;
/*Frosty the Snowman*/
import com.sun.tracing.ProbeName;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team2881.robot.RobotMap;

/**
 * Autonomous command drives forward for a few seconds at half speed in low gear.
 */
public class RunTestBoard2Components extends CommandGroup {

    public RunTestBoard2Components() {
        addSequential(new RunMotor(RobotMap.spark0, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1.5, -0.5));
        addSequential(new RunMotor(RobotMap.spark0, 0.5, 3));
        addSequential(new RunMotor(RobotMap.spark1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark3, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 0.5, -3));
        addSequential(new RunMotor(RobotMap.spark3, 0.5, 3));
        addSequential(new RunMotor(RobotMap.spark4, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark0, 3, -0.5));
        /*1st Part*/
        addSequential(new RunMotor(RobotMap.spark2, 0.5, 3));
        addSequential(new RunMotor(RobotMap.spark3, 0.5, -3));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 0.5, 3));
        addSequential(new RunMotor(RobotMap.spark1, 0.5, -3));
        addSequential(new RunMotor(RobotMap.spark0, 0.5, 3));
        addSequential(new RunMotor(RobotMap.spark3, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark0, 0.5, -3));
        addSequential(new RunMotor(RobotMap.spark1, 0.5, 3));
        addSequential(new RunMotor(RobotMap.spark0, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 3, -0.5));
        /*2nd part*/

    }

}
