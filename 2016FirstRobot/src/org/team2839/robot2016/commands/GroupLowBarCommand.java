package org.team2839.robot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class GroupLowBarCommand extends CommandGroup {
    
    public  GroupLowBarCommand() {
    	addSequential(new CatapultPrimeCommand());
    	addSequential(new GrabberHingeInCommand());
    }
}
