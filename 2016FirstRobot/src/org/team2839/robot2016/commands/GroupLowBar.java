package org.team2839.robot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class GroupLowBar extends CommandGroup {
    
    public  GroupLowBar() {
    	addSequential(new CatapultPrimeCommand());
    	// addSequential(new GrabberHingePointCommand(Constants.GRABBER_HINGE_SETPOINT_LOAD));
    }
}
