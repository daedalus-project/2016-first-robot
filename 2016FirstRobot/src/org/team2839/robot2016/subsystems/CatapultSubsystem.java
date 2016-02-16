package org.team2839.robot2016.subsystems;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.commands.CatapultStopCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CatapultSubsystem extends Subsystem {

    // Initialize your subsystem here
    public CatapultSubsystem() {
    	
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new CatapultStopCommand());
    }
    
    public void updateStatus() {
//    	SmartDashboard.putNumber("Catapult Range (feet)", Hardware.catapultRangeFinder.getFeet());
//		double volts = Hardware.catapultRangeFinder.getAverageVoltage();
//		double feet = ((volts - 0.280) / 0.14175) + 2.0;
//		SmartDashboard.putNumber("Catapult Range (feet)", feet);
//		SmartDashboard.putNumber("Catapult Range (volts)", volts);
//		SmartDashboard.putNumber("Catapult Reading", Hardware.catapultMotorPot.pidGet());
	}

	public void stop() {
		setSpeed(0.0);
	}
	
	public void setSpeed(double speed) {
		Hardware.stopbarMotor.set(speed * Constants.STOPBAR_SPEED_MULTIPLIER);
	}
	
	public Boolean primed() {
		return Hardware.stopbarPrimedLimitSwitch.get();
	}
	
	public Boolean ready() {
		return Hardware.stopbarTopLimitSwitch.get();
	}
}
