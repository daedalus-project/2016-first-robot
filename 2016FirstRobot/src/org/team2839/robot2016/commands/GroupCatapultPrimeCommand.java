package org.team2839.robot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GroupCatapultPrimeCommand extends CommandGroup {
    
    public  GroupCatapultPrimeCommand() {
        addSequential(new GrabberHingeOutCommand());
        addSequential(new CatapultPrimeCommand());
    }
}
