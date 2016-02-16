
package org.team2839.robot2016.subsystems;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Controls;
import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.commands.DriveStopCommand;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
	private double polarity;
	
	public DriveTrainSubsystem() {
		super();
		polarity = 1.0;
	}

    public void initDefaultCommand() {
        setDefaultCommand(new DriveStopCommand());
    }
    
    private double getDriveThrottle() {
    	return ((Controls.leftDriveJoystick.getThrottle() * Constants.THROTTLE) + 1.0) / 2.0;
    }
    
    public void tankDrive() {
    	double throttle = getDriveThrottle();
    	
    	double leftSpeed  = Controls.leftDriveJoystick.getY() * Constants.TANK_DRIVE_LEFT * throttle;
    	double rightSpeed = Controls.rightDriveJoystick.getY() * Constants.TANK_DRIVE_RIGHT * throttle;
    	
    	Hardware.driveLeftMotors.set(leftSpeed * polarity);
    	Hardware.driveRightMotors.set(rightSpeed * polarity);
    }
    
    public void arcadeDrive() {
    	double throttle = getDriveThrottle();
    	
    	double leftSpeed = Controls.leftDriveJoystick.getY() * Constants.ARCADE_DRIVE_LEFT_SPEED;
    	leftSpeed += Controls.leftDriveJoystick.getX() * Constants.ARCADE_DRIVE_LEFT_TURN;
    	leftSpeed *= throttle;
    	
    	double rightSpeed = Controls.leftDriveJoystick.getY() * Constants.ARCADE_DRIVE_RIGHT_SPEED;
    	rightSpeed += Controls.leftDriveJoystick.getX() * Constants.ARCADE_DRIVE_RIGHT_TURN;
    	rightSpeed *= throttle;
    	
    	Hardware.driveLeftMotors.set(leftSpeed * polarity);
    	Hardware.driveRightMotors.set(rightSpeed * polarity);
    }
    
    public void gamepadTankDrive() {
    	double throttle = getDriveThrottle();
    	
    	double leftSpeed  = Controls.gamepad.getLeftY() * Constants.GAMEPAD_TANK_DRIVE_LEFT * throttle;
    	double rightSpeed = Controls.gamepad.getRightY() * Constants.GAMEPAD_TANK_DRIVE_RIGHT * throttle;
    	
    	Hardware.driveLeftMotors.set(leftSpeed * polarity);
    	Hardware.driveRightMotors.set(rightSpeed * polarity);
    }

	public void stop() {
		Hardware.driveLeftMotors.set(0.0);
		Hardware.driveRightMotors.set(0.0);
	}

	public void switchDrivePolarity() {
		polarity *= -1.0;
	}

	public void updateStatus() {
		SmartDashboard.putString("Drive Train", this.getCurrentCommand().toString());
//		SmartDashboard.putNumber("Left Drive", Hardware.driveLeftMotors.get());
//		SmartDashboard.putNumber("Right Drive", Hardware.driveRightMotors.get());
	}
    
}

