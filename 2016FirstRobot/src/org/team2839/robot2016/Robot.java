
package org.team2839.robot2016;

import org.team2839.robot2016.utils.BetterCameraServer;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {

	public void robotInit() {
		Hardware.init();
		Subsystems.init();
		Controls.init();
		
		BetterCameraServer.init(Hardware.FRONT_CAMERA, Hardware.BACK_CAMERA);
		BetterCameraServer.start();
	}

	public void teleopInit() {
	    
	}

	public void teleopPeriodic() {
	    Hardware.compressor.setClosedLoopControl(true);
		Scheduler.getInstance().run();
		Subsystems.updateStatus();
		SmartDashboard.putBoolean("Compressor", Hardware.compressor.getClosedLoopControl());
		SmartDashboard.putNumber("Stopbar Top Voltage", Hardware.stopbarTopLimitSwitch.getVoltage());
		SmartDashboard.putNumber("Stopbar Bottom Voltage", Hardware.stopbarPrimedLimitSwitch.getVoltage());
		SmartDashboard.putNumber("Grabber Voltage", Hardware.grabberLimitSwitch.getVoltage());
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
