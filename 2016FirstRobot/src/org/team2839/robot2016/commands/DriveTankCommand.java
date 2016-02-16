
package org.team2839.robot2016.commands;

import org.team2839.robot2016.Subsystems;

import edu.wpi.first.wpilibj.command.Command;


public class DriveTankCommand extends Command {

    public DriveTankCommand() {
        requires(Subsystems.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Subsystems.driveTrain.tankDrive();
    }

    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }

    protected void interrupted() {
    }
}
