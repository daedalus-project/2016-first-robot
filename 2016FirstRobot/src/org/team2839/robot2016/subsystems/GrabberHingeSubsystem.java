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
        super("Grabber Hinge", Constants.GRABBER_HINGE_P, Constants.GRABBER_HINGE_I, Constants.GRABBER_HINGE_D,
                Constants.GRABBER_HINGE_F);
        setAbsoluteTolerance(Constants.GRABBER_HINGE_ABSOLUTE_TOLERANCE);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new GrabberHingeStopCommand());
    }

    protected double returnPIDInput() {
        return Hardware.grabberHingeEncoder.pidGet();
    }

    protected void usePIDOutput(double output) {
        Hardware.grabberHingeMotor.pidWrite(output);
    }

    public void updateStatus() {
        SmartDashboard.putBoolean("Grabber Hinge Out", isOut());
        SmartDashboard.putBoolean("Grabber Hinge In", isIn());
    }

    public void moveOut() {
        disable();
        Hardware.grabberHingeMotor.set(Constants.GRABBER_HINGE_OUT_SPEED);
//        enable();
//        setSetpoint(Constants.GRABBER_HINGE_OUT_SPEED);
    }
    
    public void moveIn() {
        disable();
        Hardware.grabberHingeMotor.set(Constants.GRABBER_HINGE_IN_SPEED);
//        enable();
//        setSetpoint(Constants.GRABBER_HINGE_IN_SPEED);
    }

    public void stop() {
        disable();
        Hardware.grabberHingeMotor.set(0.0);
//        enable();
//        setSetpoint(0.0);
    }

    public boolean isOut() {
        return Hardware.grabberHingeOutSwitch.get() ^ Constants.GRABBER_HINGE_OUT_SWITCH_XOR;
    }
    
    public boolean isIn() {
        return Hardware.grabberHingeResetSwitch.get() ^ Constants.GRABBER_HINGE_RESET_SWITCH_XOR;
    }
}
