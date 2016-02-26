package org.team2839.robot2016;

import org.team2839.robot2016.utils.AnalogLimitSwitch;
import org.team2839.robot2016.utils.Gearbox;
import org.team2839.robot2016.utils.PositionalQuadEncoder;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;


public class Hardware {

	public static final String FRONT_CAMERA = "cam1";
	public static final String BACK_CAMERA = "cam0";
	
	public static Compressor compressor;
	
	// DriveTrain
	private static SpeedController driveLeft1, driveLeft2, driveRight1, driveRight2;
	public static Gearbox driveLeftMotors, driveRightMotors;
	
	// Catapult
	public static SpeedController stopbarMotor;
	public static Solenoid stopbarSolenoid;
	public static AnalogLimitSwitch stopbarTopLimitSwitch;
	public static AnalogLimitSwitch stopbarPrimedLimitSwitch;
	
	// Grabber
	public static SpeedController grabberRoller;
	public static SpeedController grabberLeft, grabberRight;
	public static AnalogLimitSwitch grabberLimitSwitch;
	
	// Grabber Hinge
	public static SpeedController grabberHingeMotor;
	public static Encoder grabberHingeEncoder;
	public static AnalogLimitSwitch grabberHingeResetSwitch;
	public static DigitalInput grabberHingeOutSwitch;
	
	// Lifter
	public static SpeedController lifterFrontMotor, lifterRearMotor;
	public static Solenoid lifterSolenoid;
	public static PIDSource lifterFrontPot, lifterRearPot;
	
	// Claw
	public static SpeedController clawMotor;
	public static PIDSource clawPot;
	
	public static void init() {
	    compressor = new Compressor(0);
	    
		// DriveTrain
		driveLeft1  = new Victor(0);                                 // L1
		driveLeft2  = new Victor(2);                                 // L2
		driveRight1 = new Victor(1);                                 // R1
		driveRight2 = new Victor(3);                                 // R2
		driveLeftMotors  = new Gearbox(driveLeft1, driveLeft2);
		driveRightMotors = new Gearbox(driveRight1, driveRight2);
		
		stopbarMotor = new CANTalon(2);                             // C
		stopbarSolenoid = new Solenoid(0);                          // P0
		stopbarTopLimitSwitch = new AnalogLimitSwitch(2);           // CS2
		stopbarPrimedLimitSwitch = new AnalogLimitSwitch(1);        // CS1
		
		grabberRoller = new CANTalon(5);                            // G2
		grabberLeft = new CANTalon(3);                              // GL
		grabberRight = new CANTalon(7);                             // GR
		grabberLimitSwitch = new AnalogLimitSwitch(0);              // GS
		
		grabberHingeMotor = new CANTalon(1);                        // G1
		grabberHingeEncoder = new Encoder(0, 1, true, EncodingType.k1X);   // G1A, G1B
		grabberHingeEncoder.setPIDSourceType(PIDSourceType.kRate);
		grabberHingeResetSwitch = new AnalogLimitSwitch(3);
		grabberHingeOutSwitch = new DigitalInput(8);
		
		lifterFrontMotor = new CANTalon(8);                         // LF
		lifterRearMotor = new CANTalon(6);                          // LR
		lifterFrontPot = new Encoder(4, 5, false, EncodingType.k1X); // LFA, LFB
		lifterRearPot = new Encoder(2, 3, false, EncodingType.k1X); // LRA, LRB
		lifterSolenoid = new Solenoid(1);                           // P1
		
		clawMotor = new CANTalon(4);                                // F
		clawPot = new PositionalQuadEncoder(6, 7, false, EncodingType.k1X, Constants.PORTCULLIS_CLAW_CIRCUMFERENCE);   // FA, FB
	}
	
}
