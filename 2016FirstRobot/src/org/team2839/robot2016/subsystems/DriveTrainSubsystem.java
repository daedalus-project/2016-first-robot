
package org.team2839.robot2016.subsystems;

import org.team2839.robot2016.Constants;
import org.team2839.robot2016.Controls;
import org.team2839.robot2016.Hardware;
import org.team2839.robot2016.commands.DriveGamepadTankCommand;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
	
	private double polarity;
	
	private SpeedController leftStickMotor, rightStickMotor;
	
	public DriveTrainSubsystem() {
		super();
		polarity = 1.0;
		leftStickMotor = Hardware.driveLeftMotors;
		rightStickMotor = Hardware.driveRightMotors;
	}

    public void initDefaultCommand() {
        setDefaultCommand(new DriveGamepadTankCommand());
//        setDefaultCommand(new DriveStopCommand());
    }
    
    private double calculateSpeed(double baseSpeed) {
        double velocity = baseSpeed * polarity;
        return velocity * Math.abs(velocity);
    }
    
    private double getDriveThrottle() {
        return 1.0;
//    	return ((Controls.leftDriveJoystick.getThrottle() * Constants.THROTTLE) + 1.0) / 2.0;
    }
    
    public void tankDrive() {
    	double throttle = getDriveThrottle();
    	
    	double leftSpeed  = Controls.leftDriveJoystick.getY() * Constants.TANK_DRIVE_LEFT * throttle;
    	double rightSpeed = Controls.rightDriveJoystick.getY() * Constants.TANK_DRIVE_RIGHT * throttle;
    	
    	leftStickMotor.set(calculateSpeed(leftSpeed));
    	rightStickMotor.set(calculateSpeed(rightSpeed));
    }
    
    public void arcadeDrive() {
    	double throttle = getDriveThrottle();
    	
    	double leftSpeed = Controls.leftDriveJoystick.getY() * Constants.ARCADE_DRIVE_LEFT_SPEED;
    	leftSpeed += Controls.leftDriveJoystick.getX() * Constants.ARCADE_DRIVE_LEFT_TURN;
    	leftSpeed *= throttle;
    	
    	double rightSpeed = Controls.leftDriveJoystick.getY() * Constants.ARCADE_DRIVE_RIGHT_SPEED;
    	rightSpeed += Controls.leftDriveJoystick.getX() * Constants.ARCADE_DRIVE_RIGHT_TURN;
    	rightSpeed *= throttle;
    	
    	leftStickMotor.set(calculateSpeed(leftSpeed));
        rightStickMotor.set(calculateSpeed(rightSpeed));
    }
    
    public void gamepadTankDrive() {
    	double throttle = getDriveThrottle();
    	
    	double leftSpeed  = Controls.gamepad.getLeftY() * Constants.GAMEPAD_TANK_DRIVE_LEFT * throttle;
    	double rightSpeed = Controls.gamepad.getRightY() * Constants.GAMEPAD_TANK_DRIVE_RIGHT * throttle;
    	
    	leftStickMotor.set(calculateSpeed(leftSpeed));
        rightStickMotor.set(calculateSpeed(rightSpeed));
    }

	public void stop() {
		leftStickMotor.set(0.0);
		rightStickMotor.set(0.0);
	}

	public void switchDrivePolarity() {
	    SpeedController temp = leftStickMotor;
	    leftStickMotor = rightStickMotor;
	    rightStickMotor = temp;
//		polarity *= -1.0;
	}

	public void updateStatus() {
		//SmartDashboard.putString("Drive Train", this.getCurrentCommand().toString());
//		SmartDashboard.putNumber("Left Drive", Hardware.driveLeftMotors.get());
//		SmartDashboard.putNumber("Right Drive", Hardware.driveRightMotors.get());
	}
    
}

