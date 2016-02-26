package org.team2839.robot2016.commands;

import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GrabberHingeInCommand extends Command {

    public GrabberHingeInCommand() {
        requires(Subsystems.grabberHinge);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Subsystems.grabberHinge.moveIn();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Subsystems.grabberHinge.isIn();
    }

    // Called once after isFinished returns true
    protected void end() {
        Subsystems.grabberHinge.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        Subsystems.grabberHinge.stop();
    }
}
