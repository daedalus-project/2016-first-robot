package org.team2839.robot2016;

import org.team2839.robot2016.subsystems.CatapultSubsystem;
import org.team2839.robot2016.subsystems.DriveTrainSubsystem;
import org.team2839.robot2016.subsystems.GrabberHingeSubsystem;
import org.team2839.robot2016.subsystems.GrabberSubsystem;
import org.team2839.robot2016.subsystems.JiminatorSubsystem;
import org.team2839.robot2016.subsystems.LifterSubsystem;

public class Subsystems {
	
	public static DriveTrainSubsystem driveTrain;
	public static CatapultSubsystem catapult;
	public static GrabberSubsystem grabber;
	public static GrabberHingeSubsystem grabberHinge;
	public static LifterSubsystem lifter;
	public static JiminatorSubsystem jiminator;
	
	public static void init() {
		driveTrain = new DriveTrainSubsystem();
		catapult = new CatapultSubsystem();
		grabber = new GrabberSubsystem();
		grabberHinge = new GrabberHingeSubsystem();
		lifter = new LifterSubsystem();
		jiminator = new JiminatorSubsystem();
	}
	
	public static void updateStatus() {
		driveTrain.updateStatus();
		grabberHinge.updateStatus();
		catapult.updateStatus();
	}

}
