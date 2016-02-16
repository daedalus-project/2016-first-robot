package org.team2839.robot2016;

public class Constants {
	
	public static final double THROTTLE = -1.0;

	public static final double TANK_DRIVE_LEFT  = 1.0;
	public static final double TANK_DRIVE_RIGHT = -1.0;
	
	public static final double ARCADE_DRIVE_LEFT_SPEED = TANK_DRIVE_LEFT;
	public static final double ARCADE_DRIVE_LEFT_TURN  = 0.5;
	public static final double ARCADE_DRIVE_RIGHT_SPEED = TANK_DRIVE_RIGHT;
	public static final double ARCADE_DRIVE_RIGHT_TURN = -0.5;
	
	public static final double GAMEPAD_TANK_DRIVE_LEFT = TANK_DRIVE_LEFT;
	public static final double GAMEPAD_TANK_DRIVE_RIGHT = TANK_DRIVE_RIGHT;

	public static final double GRABBER_HINGE_P = 1.0;
	public static final double GRABBER_HINGE_I = 0.0;
	public static final double GRABBER_HINGE_D = 0.0;
	public static final double GRABBER_HINGE_F = 0.0;

	public static final double GRABBER_HINGE_ABSOLUTE_TOLERANCE = 0.01;

	public static final double GRABBER_HINGE_MIN_OUTPUT = -1.0;
	public static final double GRABBER_HINGE_MAX_OUTPUT = 1.0;

	public static final double GRABBER_HINGE_MIN_INPUT = 0.0;
	public static final double GRABBER_HINGE_MAX_INPUT = 5.0;

	public static final double GRABBER_HINGE_PID_OFFSET = 0.0;
	
	// CHANGE THESE!!!1
	
	
	public static final double GRABBER_HINGE_SETPOINT_SHOOT = 0.0;
	public static final double GRABBER_HINGE_SETPOINT_LOAD = 0.0;
	
	
	// CHANGE THESE!!!1
	
	public static final double GRABBER_INTAKE_STOP_DELAY = 0.1;
	public static final double GRABBER_LOAD_STOP_DELAY = 0.2;
	public static final double GRABBER_OUT_STOP_DELAY = 0.2;
	
	public static final double GRABBER_ROLLER_IN_SPEED = 1.0;
	public static final double GRABBER_LEFT_IN_SPEED = 1.0;
	public static final double GRABBER_RIGHT_IN_SPEED = -1.0;

	public static final double GRABBER_ROLLER_LOAD_SPEED = 1.0;
	public static final double GRABBER_LEFT_LOAD_SPEED = 1.0;
	public static final double GRABBER_RIGHT_LOAD_SPEED = -1.0;

	public static final double GRABBER_ROLLER_OUT_SPEED = -1.0;
	public static final double GRABBER_LEFT_OUT_SPEED = -1.0;
	public static final double GRABBER_RIGHT_OUT_SPEED = 1.0;

	public static final double STOPBAR_SPEED_MULTIPLIER = 1.0;
	public static final double STOPBAR_PRIME_SPEED = 1.0;
	public static final double STOPBAR_READY_SPEED = -1.0;

	public static final double CATAPULT_SHOOT_DELAY = 0.5;

}
