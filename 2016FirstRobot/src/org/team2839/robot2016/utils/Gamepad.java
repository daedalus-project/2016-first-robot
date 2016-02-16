package org.team2839.robot2016.utils;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * For the Logitech F310 Gamepad
 * 
 * @author Jack VanDrunen (jack@jackv.io)
 */
public class Gamepad extends Joystick {

	public static final int LEFT_X_AXIS = 0;
	public static final int LEFT_Y_AXIS = 1;
	public static final int LEFT_TRIGGER_AXIS = 2;
	public static final int RIGHT_TRIGGER_AXIS = 3;
	public static final int RIGHT_X_AXIS = 4;
	public static final int RIGHT_Y_AXIS = 5;

	public static final int BUTTON_A = 1;
	public static final int BUTTON_B = 2;
	public static final int BUTTON_X = 3;
	public static final int BUTTON_Y = 4;
	public static final int BUTTON_LEFT = 5;
	public static final int BUTTON_RIGHT = 6;
	public static final int BUTTON_BACK = 7;
	public static final int BUTTON_START = 8;
	public static final int BUTTON_LEFT_THUMB = 9;
	public static final int BUTTON_RIGHT_THUMB = 10;
	public static final int BUTTON_LEFT_TRIGGER = 11;
	public static final int BUTTON_RIGHT_TRIGGER = 12;
	public static final int BUTTON_POV_NORTH = 13;
	public static final int BUTTON_POV_NORTH_EAST = 14;
	public static final int BUTTON_POV_EAST = 15;
	public static final int BUTTON_POV_SOUTH_EAST = 16;
	public static final int BUTTON_POV_SOUTH = 17;
	public static final int BUTTON_POV_SOUTH_WEST = 18;
	public static final int BUTTON_POV_WEST = 19;
	public static final int BUTTON_POV_NORTH_WEST = 20;

	public static final int POV_CENTER = -1;
	public static final int POV_NORTH = 0;
	public static final int POV_NORTH_EAST = 45;
	public static final int POV_EAST = 90;
	public static final int POV_SOUTH_EAST = 135;
	public static final int POV_SOUTH = 180;
	public static final int POV_SOUTH_WEST = 225;
	public static final int POV_WEST = 270;
	public static final int POV_NORTH_WEST = 315;

	public class TriggerButton extends JoystickButton {
		public TriggerButton(GenericHID joystick, int buttonNumber) {
			super(joystick, buttonNumber);
		}
	}

	public Gamepad(int slot) {
		super(slot);
	}

	@Override
	public boolean getRawButton(int button) {
		if (button < 11) {
			return super.getRawButton(button);
		}
		switch (button) {
		case BUTTON_LEFT_TRIGGER:
			return (getLeftTrigger() > 0.75);
		case BUTTON_RIGHT_TRIGGER:
			return (getRightTrigger() > 0.75);
		case BUTTON_POV_NORTH:
			return (getPOV() == POV_NORTH);
		case BUTTON_POV_NORTH_EAST:
			return (getPOV() == POV_NORTH_EAST);
		case BUTTON_POV_NORTH_WEST:
			return (getPOV() == POV_NORTH_WEST);
		case BUTTON_POV_SOUTH:
			return (getPOV() == POV_SOUTH);
		case BUTTON_POV_SOUTH_EAST:
			return (getPOV() == POV_SOUTH_EAST);
		case BUTTON_POV_SOUTH_WEST:
			return (getPOV() == POV_SOUTH_WEST);
		case BUTTON_POV_EAST:
			return (getPOV() == POV_EAST);
		case BUTTON_POV_WEST:
			return (getPOV() == POV_WEST);
		default:
			return false;
		}
	}

	public double getLeftX() {
		return getRawAxis(LEFT_X_AXIS);
	}

	public double getLeftY() {
		return getRawAxis(LEFT_Y_AXIS);
	}

	public double getRightX() {
		return getRawAxis(RIGHT_X_AXIS);
	}

	public double getRightY() {
		return getRawAxis(RIGHT_Y_AXIS);
	}

	public double getLeftTrigger() {
		return getRawAxis(LEFT_TRIGGER_AXIS);
	}

	public double getRightTrigger() {
		return getRawAxis(RIGHT_TRIGGER_AXIS);
	}

}
