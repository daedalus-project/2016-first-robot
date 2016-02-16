package org.team2839.robot2016.commands;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Subsystems;
import org.team2839.robot2016.utils.Sleeper;

import edu.wpi.first.wpilibj.command.Command;

public class GrabberBallOutCommand extends Command {

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Subsystems.grabber.pushOut();
	}

	@Override
	protected boolean isFinished() {
		if (!Subsystems.grabber.ballIn()) {
			if (!Sleeper.timerRunning("Ball Out")) {
				Sleeper.startTimer("Ball Out", Constants.GRABBER_OUT_STOP_DELAY);
			}
			return Sleeper.timesUp("Ball Out");
		}
		return false;
	}

	@Override
	protected void end() {
		Sleeper.cancelTimer("Ball Out");
		Subsystems.grabber.stop();
	}

	@Override
	protected void interrupted() {
		Sleeper.cancelTimer("Ball Out");
		Subsystems.grabber.stop();
	}

}
