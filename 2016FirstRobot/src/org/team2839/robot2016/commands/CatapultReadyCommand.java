package org.team2839.robot2016.commands;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CatapultReadyCommand extends Command {

    public CatapultReadyCommand() {
        requires(Subsystems.catapult);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Subsystems.catapult.setSpeed(Constants.STOPBAR_READY_SPEED);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Subsystems.catapult.ready();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Subsystems.catapult.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Subsystems.catapult.stop();
    }
}
