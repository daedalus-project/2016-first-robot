package org.team2839.robot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GrabberHingeReadyCommand extends CommandGroup {
    
    public  GrabberHingeReadyCommand() {
        addParallel(new GrabberBallLoadCommand());
        addParallel(new GrabberHingeOutCommand());
    }
}
