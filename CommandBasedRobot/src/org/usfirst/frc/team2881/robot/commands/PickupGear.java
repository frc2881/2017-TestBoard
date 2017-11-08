package org.usfirst.frc.team2881.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PickupGear extends CommandGroup {

    public PickupGear() {
        addSequential(new IntakeGear());
        addSequential(new RumbleJoysticks());
    }
}
