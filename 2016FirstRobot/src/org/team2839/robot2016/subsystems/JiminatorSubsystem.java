package org.team2839.robot2016.subsystems;

import org.team2839.robot2016.Hardware;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class JiminatorSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void updateStatus() {
    	SmartDashboard.putNumber("Portcullis Claw", Hardware.clawPot.pidGet());
    }
}

