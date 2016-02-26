package org.team2839.robot2016.commands;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Subsystems;
import org.team2839.robot2016.utils.Sleeper;

import edu.wpi.first.wpilibj.command.Command;

public class GrabberBallLoadCommand extends Command {

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Subsystems.grabber.pushIn();
	}

	@Override
	protected boolean isFinished() {
//		if (!Subsystems.grabber.ballIn()) {
//			if (!Sleeper.timerRunning("Ball Load")) {
//				Sleeper.startTimer("Ball Load", Constants.GRABBER_LOAD_STOP_DELAY);
//			}
//			return Sleeper.timesUp("Ball Load");
//		}
//		return false;
	    return Subsystems.grabberHinge.isOut();
	}

	@Override
	protected void end() {
//		Sleeper.cancelTimer("Ball Load");
		Subsystems.grabber.stop();
	}

	@Override
	protected void interrupted() {
//		Sleeper.cancelTimer("Ball Load");
		Subsystems.grabber.stop();
	}

}
