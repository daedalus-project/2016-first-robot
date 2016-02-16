
package org.team2839.robot2016;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class Robot extends IterativeRobot {

	public void robotInit() {
		Hardware.init();
		Subsystems.init();
		Controls.init();
		
//		BetterCameraServer.init(Hardware.FRONT_CAMERA, Hardware.BACK_CAMERA);
//		BetterCameraServer.start();
	}

	public void teleopInit() {

	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		Subsystems.updateStatus();
	}

	public void autonomousInit() {

	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
		LiveWindow.run();
	}

	public void disabledInit(){

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
}
