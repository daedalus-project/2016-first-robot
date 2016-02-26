package org.team2839.robot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class GroupReadyToShootCommand extends CommandGroup {
    
    public  GroupReadyToShootCommand() {
        addSequential(new GrabberHingeReadyCommand());
        addSequential(new CatapultReadyCommand());
    }
}
