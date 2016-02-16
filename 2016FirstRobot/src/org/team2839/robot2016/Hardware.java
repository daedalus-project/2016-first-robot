package org.team2839.robot2016;

import org.team2839.robot2016.utils.Gearbox;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;


public class Hardware {

	public static final String FRONT_CAMERA = "cam0";
	public static final String BACK_CAMERA = "cam1";
	
	// DriveTrain
	private static SpeedController driveLeft1, driveLeft2, driveRight1, driveRight2;
	public static Gearbox driveLeftMotors, driveRightMotors;
	
	// Catapult
	public static SpeedController stopbarMotor;
	public static Solenoid stopbarSolenoid;
	public static DigitalInput stopbarTopLimitSwitch;
	public static DigitalInput stopbarPrimedLimitSwitch;
	
	// Grabber
	public static SpeedController grabberRoller;
	public static SpeedController grabberLeft, grabberRight;
	public static DigitalInput grabberLimitSwitch;
	
	// Grabber Hinge
	public static SpeedController grabberHingeMotor;
	public static PIDSource grabberHingePot;
	
	// Lifter
	public static SpeedController lifterFrontMotor, lifterRearMotor;
	public static Solenoid lifterSolenoid1, lifterSolenoid2;
	public static PIDSource lifterFrontPot, lifterRearPot;
	
	// Claw
	public static SpeedController clawMotor;
	public static PIDSource clawPot;
	
	public static void init() {
		// DriveTrain
		driveLeft1  = new CANTalon(1);                                 // L1
		driveLeft2  = new CANTalon(2);                                 // L2
		driveRight1 = new CANTalon(3);                                 // R1
		driveRight2 = new CANTalon(4);                                 // R2
		driveLeftMotors  = new Gearbox(driveLeft1, driveLeft2);
		driveRightMotors = new Gearbox(driveRight1, driveRight2);
	}
	
}
