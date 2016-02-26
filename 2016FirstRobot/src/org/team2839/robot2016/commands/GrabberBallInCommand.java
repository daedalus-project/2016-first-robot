package org.team2839.robot2016.commands;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Subsystems;
import org.team2839.robot2016.utils.Sleeper;

import edu.wpi.first.wpilibj.command.Command;

public class GrabberBallInCommand extends Command {

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Subsystems.grabber.pullIn();
	}

	@Override
	protected boolean isFinished() {
	    return Subsystems.grabber.ballIn();
//		if (Subsystems.grabber.ballIn()) {
//			if (!Sleeper.timerRunning("Ball Intake")) {
//				Sleeper.startTimer("Ball Intake", Constants.GRABBER_INTAKE_STOP_DELAY);
//			}
//			return Sleeper.timesUp("Ball Intake");
//		}
//		return false;
	}

	@Override
	protected void end() {
//		Sleeper.cancelTimer("Ball Intake");
		Subsystems.grabber.stop();
	}

	@Override
	protected void interrupted() {
//		Sleeper.cancelTimer("Ball Intake");
		Subsystems.grabber.stop();
	}

}
