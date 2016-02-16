package org.team2839.robot2016.utils;

import edu.wpi.first.wpilibj.AnalogInput;

public class AnalogRangeFinder extends AnalogInput implements RangeFinder {

	public AnalogRangeFinder(int channel) {
		super(channel);
	}
	
	public double getFeet() {
		return ((getAverageVoltage() - 0.280) / 0.14175) + 2.0;
	}

}
