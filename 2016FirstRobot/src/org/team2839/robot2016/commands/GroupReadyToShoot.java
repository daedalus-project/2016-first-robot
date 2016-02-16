package org.team2839.robot2016.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class GroupReadyToShoot extends CommandGroup {
    
    public  GroupReadyToShoot() {
    	// addSequential(new GrabberHingePointCommand(Constants.GRABBER_HINGE_SETPOINT_SHOOT));
    	addSequential(new CatapultPrimeCommand());
    	addSequential(new CatapultReadyCommand());
    }
}
