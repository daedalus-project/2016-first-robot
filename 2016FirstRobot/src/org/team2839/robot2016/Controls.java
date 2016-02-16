package org.team2839.robot2016;

import org.team2839.robot2016.commands.DriveArcadeCommand;
import org.team2839.robot2016.commands.DriveGamepadTankCommand;
import org.team2839.robot2016.commands.DriveStopCommand;
import org.team2839.robot2016.commands.DriveTankCommand;
import org.team2839.robot2016.commands.DriveToggleCommand;
import org.team2839.robot2016.utils.Gamepad;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class Controls {
	
	public static Joystick leftDriveJoystick, rightDriveJoystick;
	public static Gamepad gamepad;
	
	private static Button driveTank, driveArcade, driveGamepadTank, driveStop, driveToggle, driveGamepadToggle;
	
	public static void init() {
		leftDriveJoystick = new Joystick(0);
		rightDriveJoystick = new Joystick(1);
		gamepad = new Gamepad(2);
		
		driveTank = new JoystickButton(leftDriveJoystick, 3);
		driveTank.whenPressed(new DriveTankCommand());
		
		driveArcade = new JoystickButton(leftDriveJoystick, 4);
		driveArcade.whenPressed(new DriveArcadeCommand());
		
		driveGamepadTank = new JoystickButton(leftDriveJoystick, 5);
		driveGamepadTank.whenPressed(new DriveGamepadTankCommand());
		
		driveStop = new JoystickButton(leftDriveJoystick, 2);
		driveStop.whenPressed(new DriveStopCommand());
		
		driveToggle = new JoystickButton(leftDriveJoystick, 1);
		driveToggle.whenPressed(new DriveToggleCommand());
		
		driveGamepadToggle = new JoystickButton(gamepad, Gamepad.BUTTON_RIGHT);
		driveGamepadToggle.whenPressed(new DriveToggleCommand());
	}

}

