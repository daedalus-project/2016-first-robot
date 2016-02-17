package org.team2839.robot2016.subsystems;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.commands.GrabberStopCommand;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GrabberSubsystem extends Subsystem {

    public void initDefaultCommand() {
        setDefaultCommand(new GrabberStopCommand());
    }
    
    public void stop() {
    	Hardware.grabberRoller.set(0);
    	Hardware.grabberLeft.set(0);
    	Hardware.grabberRight.set(0);
    }
    
    public void pullIn() {
    	Hardware.grabberRoller.set(Constants.GRABBER_ROLLER_IN_SPEED);
    	Hardware.grabberLeft.set(Constants.GRABBER_LEFT_IN_SPEED);
    	Hardware.grabberRight.set(Constants.GRABBER_RIGHT_IN_SPEED);
    }
    
    public void pushIn() {
    	Hardware.grabberRoller.set(Constants.GRABBER_ROLLER_LOAD_SPEED);
    	Hardware.grabberLeft.set(Constants.GRABBER_LEFT_LOAD_SPEED);
    	Hardware.grabberRight.set(Constants.GRABBER_RIGHT_LOAD_SPEED);
    }
    
    public void pushOut() {
    	Hardware.grabberRoller.set(Constants.GRABBER_ROLLER_OUT_SPEED);
    	Hardware.grabberLeft.set(Constants.GRABBER_LEFT_OUT_SPEED);
    	Hardware.grabberRight.set(Constants.GRABBER_RIGHT_OUT_SPEED);
    }
    
    public boolean ballIn() {
    	return Hardware.grabberLimitSwitch.get();
    }

    public void updateStatus() {
        SmartDashboard.putBoolean("Grabber Switch", Hardware.grabberLimitSwitch.get());
    }

}

