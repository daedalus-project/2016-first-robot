package org.team2839.robot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GroupBallEjectCommand extends CommandGroup {
    
    public  GroupBallEjectCommand() {
        addSequential(new GrabberHingeOutCommand());
        addSequential(new GrabberBallOutCommand());
    }
}
