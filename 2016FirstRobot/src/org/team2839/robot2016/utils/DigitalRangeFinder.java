package org.team2839.robot2016.utils;

import edu.wpi.first.wpilibj.Counter;

public class DigitalRangeFinder extends Counter implements RangeFinder {

	public DigitalRangeFinder(int channel) {
		super(channel);
		setMaxPeriod(1.0);
	    setSemiPeriodMode(true);
	    reset();
	}

	@Override
	public double getFeet() {
		return ((getPeriod() * 1000000.0) / 147.0) / 12.0;
	}

}
