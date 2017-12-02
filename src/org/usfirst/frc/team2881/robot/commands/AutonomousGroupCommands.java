package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class AutonomousGroupCommands extends CommandGroup {

    public AutonomousGroupCommands() {
        addSequential(new DrivePastLine());
        addSequential(new WaitCommand(1));
        addSequential(new ScoreGear());


    }
}
