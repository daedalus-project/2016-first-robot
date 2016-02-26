package org.team2839.robot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GroupBallInCommand extends CommandGroup {
    
    public  GroupBallInCommand() {
        addSequential(new GrabberHingeOutCommand());
        addSequential(new GrabberBallInCommand());
        addSequential(new GrabberHingeInCommand());
    }
}
