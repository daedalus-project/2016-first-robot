package org.team2839.robot2016.subsystems;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.Subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CatapultSubsystem extends Subsystem {

    // Initialize your subsystem here
    public CatapultSubsystem() {
    	
    }
    
    public void initDefaultCommand() {
//        setDefaultCommand(new CatapultStopCommand());
    }
    
    public void updateStatus() {
        SmartDashboard.putBoolean("Catapult Ready", ready());
        SmartDashboard.putBoolean("Catapult Primed", primed());
	}

	public void stop() {
		setSpeed(0.0);
	}
	
	public void setSpeed(double speed) {
		Hardware.stopbarMotor.set(speed);
	}
	
	public Boolean primed() {
		return Hardware.stopbarPrimedLimitSwitch.get() ^ Constants.STOPBAR_PRIMED_XOR;
	}
	
	public Boolean ready() {
		return Hardware.stopbarTopLimitSwitch.get() ^ Constants.STOPBAR_TOP_XOR;
	}
	
	public void shooterFire() {
	    // Safety feature!
	    if (ready() && Subsystems.grabberHinge.isOut()) {
	        Hardware.stopbarSolenoid.set(true);
	    }
	}
	
	public void shooterRetract() {
	    Hardware.stopbarSolenoid.set(false);
	}
}
