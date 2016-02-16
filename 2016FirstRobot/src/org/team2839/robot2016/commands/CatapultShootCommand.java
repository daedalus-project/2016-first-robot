package org.team2839.robot2016.commands;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.Subsystems;
import org.team2839.robot2016.utils.Sleeper;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CatapultShootCommand extends Command {

    public CatapultShootCommand() {
        requires(Subsystems.catapult);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Hardware.stopbarSolenoid.set(true);
    	Sleeper.startTimer("Catapult Solenoid", Constants.CATAPULT_SHOOT_DELAY);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Sleeper.timesUp("Catapult Solenoid");
    }

    // Called once after isFinished returns true
    protected void end() {
    	Sleeper.cancelTimer("Catapult Solenoid");
    	Hardware.stopbarSolenoid.set(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Sleeper.cancelTimer("Catapult Solenoid");
    	Hardware.stopbarSolenoid.set(false);
    }
}
