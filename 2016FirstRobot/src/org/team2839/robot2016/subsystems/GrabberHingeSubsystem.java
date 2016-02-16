package org.team2839.robot2016.subsystems;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.commands.GrabberHingeStopCommand;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GrabberHingeSubsystem extends PIDSubsystem {

    public GrabberHingeSubsystem() {
    	super("Grabber Hinge", Constants.GRABBER_HINGE_P, Constants.GRABBER_HINGE_I, Constants.GRABBER_HINGE_D, Constants.GRABBER_HINGE_F);
    	setAbsoluteTolerance(Constants.GRABBER_HINGE_ABSOLUTE_TOLERANCE);
    	getPIDController().setContinuous(false);
    	getPIDController().setInputRange(Constants.GRABBER_HINGE_MIN_INPUT, Constants.GRABBER_HINGE_MAX_INPUT);
    	getPIDController().setOutputRange(Constants.GRABBER_HINGE_MIN_OUTPUT, Constants.GRABBER_HINGE_MAX_OUTPUT);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new GrabberHingeStopCommand());
    }
    
    protected double returnPIDInput() {
    	return Hardware.grabberHingePot.pidGet() - Constants.GRABBER_HINGE_PID_OFFSET;
    }
    
    protected void usePIDOutput(double output) {
        Hardware.grabberHingeMotor.pidWrite(output);
    }
    
    public void updateStatus() {
    	SmartDashboard.putNumber("Grabber Hinge", Hardware.grabberHingePot.pidGet());
    }

	public void point(double setpoint) {
		enable();
		setSetpoint(setpoint);
	}

	public void stop() {
		enable();
		setSetpointRelative(0.0);
	}
}
