package org.team2839.robot2016.subsystems;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.commands.GrabberHingeStopCommand;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PortcullisClawSubsystem extends PIDSubsystem {

    public PortcullisClawSubsystem() {
        super("Portcullis Claw", Constants.PORTCULLIS_CLAW_P, Constants.PORTCULLIS_CLAW_I, Constants.PORTCULLIS_CLAW_D,
                Constants.PORTCULLIS_CLAW_F);
        setAbsoluteTolerance(Constants.PORTCULLIS_CLAW_ABSOLUTE_TOLERANCE);
        getPIDController().setContinuous(false);
        getPIDController().setInputRange(Constants.PORTCULLIS_CLAW_MIN_INPUT, Constants.PORTCULLIS_CLAW_MAX_INPUT);
        getPIDController().setOutputRange(Constants.PORTCULLIS_CLAW_MIN_OUTPUT, Constants.PORTCULLIS_CLAW_MAX_OUTPUT);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new GrabberHingeStopCommand());
    }

    protected double returnPIDInput() {
        return Hardware.grabberHingePot.pidGet() - Constants.PORTCULLIS_CLAW_PID_OFFSET;
    }

    protected void usePIDOutput(double output) {
        Hardware.grabberHingeMotor.pidWrite(output);
    }

    public void updateStatus() {
        SmartDashboard.putNumber("Portcullis Claw", Hardware.clawPot.pidGet());
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
