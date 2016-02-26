package org.team2839.robot2016;

public class Constants {
	
	public static final double THROTTLE = -1.0;

	public static final double TANK_DRIVE_LEFT  = -1.0;
	public static final double TANK_DRIVE_RIGHT = 1.0;
	
	public static final double ARCADE_DRIVE_LEFT_SPEED = TANK_DRIVE_LEFT;
	public static final double ARCADE_DRIVE_LEFT_TURN  = 0.5;
	public static final double ARCADE_DRIVE_RIGHT_SPEED = TANK_DRIVE_RIGHT;
	public static final double ARCADE_DRIVE_RIGHT_TURN = -0.5;
	
	public static final double GAMEPAD_TANK_DRIVE_LEFT = TANK_DRIVE_LEFT;
	public static final double GAMEPAD_TANK_DRIVE_RIGHT = TANK_DRIVE_RIGHT;

	public static final double GRABBER_HINGE_P = 0.2;
	public static final double GRABBER_HINGE_I = 0.0;
	public static final double GRABBER_HINGE_D = 0.0;
	public static final double GRABBER_HINGE_F = 0.0;

	public static final double GRABBER_HINGE_ABSOLUTE_TOLERANCE = 0.01;
	
	public static final double GRABBER_HINGE_IN_SPEED = -0.65;
	public static final double GRABBER_HINGE_OUT_SPEED = 0.5;
	
	public static final boolean GRABBER_HINGE_RESET_SWITCH_XOR = false;
	public static final boolean GRABBER_HINGE_OUT_SWITCH_XOR = true;
	
	public static final boolean GRABBER_SWITCH_XOR = false;
	
	public static final double GRABBER_INTAKE_STOP_DELAY = 0.1;
	public static final double GRABBER_LOAD_STOP_DELAY = 0.2;
	public static final double GRABBER_OUT_STOP_DELAY = 0.2;
	
	public static final double GRABBER_ROLLER_IN_SPEED = -1.0;
	public static final double GRABBER_LEFT_IN_SPEED = -1.0;
	public static final double GRABBER_RIGHT_IN_SPEED = 1.0;

	public static final double GRABBER_ROLLER_LOAD_SPEED = GRABBER_ROLLER_IN_SPEED;
	public static final double GRABBER_LEFT_LOAD_SPEED = GRABBER_LEFT_IN_SPEED;
	public static final double GRABBER_RIGHT_LOAD_SPEED = GRABBER_RIGHT_IN_SPEED;

	public static final double GRABBER_ROLLER_OUT_SPEED = -1.0 * GRABBER_ROLLER_IN_SPEED;
	public static final double GRABBER_LEFT_OUT_SPEED = -1.0 * GRABBER_LEFT_IN_SPEED;
	public static final double GRABBER_RIGHT_OUT_SPEED = -1.0 * GRABBER_RIGHT_IN_SPEED;

	public static final double STOPBAR_PRIME_SPEED = 1.0;
	public static final double STOPBAR_READY_SPEED = -1.0;
	
	public static final boolean STOPBAR_TOP_XOR = true;
	public static final boolean STOPBAR_PRIMED_XOR = true;

	public static final double CATAPULT_SHOOT_DELAY = 0.5;

    public static final double PORTCULLIS_CLAW_P = 5.0;
    public static final double PORTCULLIS_CLAW_I = 0.01;
    public static final double PORTCULLIS_CLAW_D = 0.0;
    public static final double PORTCULLIS_CLAW_F = 0.0;

    public static final double PORTCULLIS_CLAW_ABSOLUTE_TOLERANCE = 0.001;

    public static final double PORTCULLIS_CLAW_MIN_INPUT = 0.0;
    public static final double PORTCULLIS_CLAW_MAX_INPUT = 5.0;

    public static final double PORTCULLIS_CLAW_MIN_OUTPUT = -1.0;
    public static final double PORTCULLIS_CLAW_MAX_OUTPUT = 1.0;

    public static final double PORTCULLIS_CLAW_PID_OFFSET = 0.0;
    
    public static final double PORTCULLIS_CLAW_SETPOINT_EXTEND = 3.500;
    public static final double PORTCULLIS_CLAW_SETPOINT_MID = 4.340;
    public static final double PORTCULLIS_CLAW_SETPOINT_TUCK = 4.99;

    public static final int PORTCULLIS_CLAW_CIRCUMFERENCE = 1000;

}
