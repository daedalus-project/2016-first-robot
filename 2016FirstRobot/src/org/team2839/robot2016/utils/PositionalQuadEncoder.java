package org.team2839.robot2016.utils;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;

public class PositionalQuadEncoder extends Encoder {
	
	private int ticksPerRevolution;

	public PositionalQuadEncoder(int aChannel, int bChannel, boolean reverseDirection,
								 EncodingType encodingType, int ticksPerRevolution) {
		super(aChannel, bChannel, reverseDirection, encodingType);
		setDistancePerPulse(1.0);
		setTicksPerRevolution(ticksPerRevolution);
	}

	public int getTicksPerRevolution() {
		return ticksPerRevolution;
	}

	public void setTicksPerRevolution(int ticksPerRevolution) {
		this.ticksPerRevolution = ticksPerRevolution;
	}
	
	@Override
	public double pidGet() {
		return 5.0 * (((double) (getDistance() % ticksPerRevolution)) / ((double) ticksPerRevolution));
	}
	
	@Override
	public PIDSourceType getPIDSourceType() {
		return PIDSourceType.kDisplacement;
	}
	
	@Override
	public void setPIDSourceType(PIDSourceType pidSource) {
	}

}
