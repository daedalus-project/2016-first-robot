package org.team2839.robot2016.commands;

import org.team2839.robot2016.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

public class GrabberStopCommand extends Command {

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Subsystems.grabber.stop();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
