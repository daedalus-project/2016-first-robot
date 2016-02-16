
package org.team2839.robot2016.commands;

import org.team2839.robot2016.Subsystems;

import edu.wpi.first.wpilibj.command.Command;


public class DriveGamepadTankCommand extends Command {

    public DriveGamepadTankCommand() {
        requires(Subsystems.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Subsystems.driveTrain.gamepadTankDrive();
    }

    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }

    protected void interrupted() {
    }
}
