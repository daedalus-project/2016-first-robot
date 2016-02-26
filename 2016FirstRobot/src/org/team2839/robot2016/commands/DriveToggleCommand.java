package org.team2839.robot2016.commands;

import org.team2839.robot2016.Subsystems;
import org.team2839.robot2016.utils.BetterCameraServer;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveToggleCommand extends Command {

    public DriveToggleCommand() {
    }

    protected void initialize() {
    	Subsystems.driveTrain.switchDrivePolarity();
    	BetterCameraServer.switchCamera();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
