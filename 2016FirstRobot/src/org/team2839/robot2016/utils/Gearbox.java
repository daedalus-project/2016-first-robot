package org.team2839.robot2016.utils;

import edu.wpi.first.wpilibj.SpeedController;


/**
 * 
 * @author Jack
 *
 */
public class Gearbox implements SpeedController {
	
	private SpeedController[] motors;

	public Gearbox(SpeedController... motorList) {
		motors = new SpeedController[motorList.length];
		for (int i = 0; i < motorList.length; i++) {
			motors[i] = motorList[i];
		}
	}
	
	@Override
	public void pidWrite(double output) {
		for(int i = 0;i < motors.length;i++){
			motors[i].pidWrite(output);
		}
	}

	@Override
	public double get() {
		return motors[0].get();
	}

	@Override
	public void set(double speed, byte syncGroup) {
		for(int i = 0;i < motors.length;i++){
			motors[i].set(speed,syncGroup);
		}
	}

	@Override
	public void set(double speed) {
		for(int i = 0;i < motors.length;i++){
			motors[i].set(speed);
		}
	}

	@Override
	public void setInverted(boolean isInverted) {
		for(int i = 0;i < motors.length;i++){
			motors[i].setInverted(isInverted);
		}
	}

	@Override
	public boolean getInverted() {
		return motors[0].getInverted();
	}

	@Override
	public void disable() {
		for(int i = 0;i < motors.length;i++){
			motors[i].disable();
		}
	}

}
