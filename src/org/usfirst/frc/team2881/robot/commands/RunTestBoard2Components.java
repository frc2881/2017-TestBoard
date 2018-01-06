package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc.team2881.robot.RobotMap;

/**
 * Autonomous command drives forward for a few seconds at half speed in low gear.
 */
public class RunTestBoard2Components extends CommandGroup {

    public RunTestBoard2Components() {
        addSequential(new RunMotor(RobotMap.spark0, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, -0.5));
        addSequential(new WaitCommand(400));
        //hot cheetos and takis
        addSequential(new RunMotor(RobotMap.spark0, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, -0.5));
        addSequential(new WaitCommand(400));
        //hot cheetos and takis
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon3, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon4, 1, -0.5));
        //i can't get enough of these hot cheetos and takis
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 2, -0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon5, 1, 0.5));
        //got my fingers stained red and i cannot get them off me
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon2, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon3, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon5, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon4, 1, -0.5));
        //you can catch me and my crew eating hot cheetos and takis
        addSequential(new RunMotor(RobotMap.spark0, 1, -0.5));
        addSequential(new WaitCommand(600));
        //bow
        addSequential(new RunMotor(RobotMap.spark0, 2, 0.5));
        addSequential(new WaitCommand(400));
        addSequential(new RunMotor(RobotMap.spark1, 2, 0.5));
        addSequential(new WaitCommand(400));
        addSequential(new RunMotor(RobotMap.spark2, 2, 0.5));
        addSequential(new WaitCommand(400));
        addSequential(new RunMotor(RobotMap.spark3, 2, 0.5));
        addSequential(new WaitCommand(400));
        addSequential(new RunMotor(RobotMap.spark4, 2, 0.5));
        addSequential(new WaitCommand(400));
        addSequential(new RunMotor(RobotMap.spark5, 2, 0.5));
        addSequential(new WaitCommand(400));
        addSequential(new RunMotor(RobotMap.spark6, 2, 0.5));
        addSequential(new WaitCommand(400));
        addSequential(new RunMotor(RobotMap.spark7, 2, 0.5));
        //snack snack snack crunch, snack snack snack munch,
        addSequential(new RunMotor(RobotMap.spark0, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, -0.5));
        addSequential(new WaitCommand(400));
        //hot cheetos and takis
        addSequential(new RunMotor(RobotMap.spark0, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, -0.5));
        //hot cheetos and takis
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon2, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon3, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon5, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon4, 1, -0.5));
        //you can catch me and my crew eating hot cheetos and takis
        new RunMotor(RobotMap.spark0, 1, 0.5);
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 2, 0.5));
        addSequential(new WaitCommand(400));
        //it's about a quarter to a four
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 2, 0.5));
        addSequential(new WaitCommand(400));
        //rolling to the store
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 2, 0.5));
        //what you bout to get? hah
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 2, 0.5));
        //you already know
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon3, 2, 0.5));
        addSequential(new RunMotor(RobotMap.talon4, 2, 0.5));
        //got like three or four dollars and a couple odd cents
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon4, 2, 0.5));
        addSequential(new RunMotor(RobotMap.talon5, 2, 0.5));
        addSequential(new WaitCommand(200));
        //bout to cop me some hot cheetos and a lemonade brisk
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, .5, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1.5, 0.5));
        addSequential(new WaitCommand(200));
        //i'm riding around on my bicycle
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1.5, 0.5));
        addSequential(new WaitCommand(400));
        //riding around on my bicycle
        addSequential(new RunMotor(RobotMap.spark0, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        //pull up to the studio
        addSequential(new RunMotor(RobotMap.spark0, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, .5, -0.5));
        addSequential(new RunMotor(RobotMap.spark7, .5, -0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon2, .5, 0.5));
        addSequential(new RunMotor(RobotMap.talon3, 1, 0.5));
        addSequential(new WaitCommand(300));
        //Cuz you know the kid be melting them microphones
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 2, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 2, 0.5));
        addSequential(new RunMotor(RobotMap.talon2, 2, 0.5));
        //Munchin on my takis like i just don't care
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon5, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark0, 2, -0.5));
        addSequential(new WaitCommand(400));
        //then i walk up to your girl and she asking me to share. bow!
        addSequential(new RunMotor(RobotMap.spark0, 2, 0.5));
        addSequential(new WaitCommand(600));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, -0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, -0.5));
        addSequential(new RunMotor(RobotMap.talon0, 2, 0.5));
        addSequential(new WaitCommand(600));
        //yo, i'm hungry where them cheetos at
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 2, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.talon2, 1, 0.5));
        //they stay biting like where them mosquitoes at
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1.5, 0.5));
        addSequential(new WaitCommand(200));
        //i'm on point like an elbow
        addSequential(new RunMotor(RobotMap.spark0, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1.5, -0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1.5, -0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1.5, -0.5));
        //hands red like i'm elmo
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, .5, 0.5));
        addSequential(new RunMotor(RobotMap.talon0, 1.5, 0.5));
        //my mama said 'have you had enough?'
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1.5, 0.5));
        //i look and i said 'no m'am'
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1.5, 0.5));
        addSequential(new WaitCommand(200));
        //i go ham in the grocery store
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new WaitCommand(400));
        //orange fanta and takis
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark7, 1, 0.5));
        addSequential(new WaitCommand(200));
        //ridin around with my allowance
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1, 0.5));
        addSequential(new WaitCommand(400));
        //so nobody can stop me
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1.5, 0.5));
        //all the kids wanna be him
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1.5, 0.5));
        //go crazy when they see him
        addSequential(new RunMotor(RobotMap.spark0, 1, 0.5));
        addSequential(new RunMotor(RobotMap.spark1, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark2, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark3, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark4, .5, 0.5));
        addSequential(new RunMotor(RobotMap.spark5, 1.5, 0.5));
        addSequential(new RunMotor(RobotMap.spark6, 1.5, 0.5));
        //go crazy when they see him



    }
}
