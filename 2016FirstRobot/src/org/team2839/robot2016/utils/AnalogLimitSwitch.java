package org.team2839.robot2016.utils;

import edu.wpi.first.wpilibj.AnalogInput;

public class AnalogLimitSwitch {
    
    private AnalogInput source;
    
    public AnalogLimitSwitch(int channel) {
        source = new AnalogInput(channel);
    }
    
    public boolean get() {
        return source.getAverageVoltage() > 0.15;
    }
    
    public double getVoltage() {
        return source.getAverageVoltage();
    }

}
