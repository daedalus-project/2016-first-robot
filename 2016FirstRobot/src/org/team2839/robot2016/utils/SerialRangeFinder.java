package org.team2839.robot2016.utils;

import java.util.concurrent.atomic.AtomicInteger;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SerialPort.Port;


/**
 * 
 * IT STRIKES AGAIN!
 * ("Psycho"-esque string sforzando)
 * 
 * @author Jack
 *
 */
public class SerialRangeFinder {
	
	private static SerialPort port;
	private static AtomicInteger range;
	private static boolean serving = false;
	
	public synchronized static void start() {
		port = new SerialPort(9600, Port.kOnboard);
		range = new AtomicInteger(-1);
		
		if (serving) {
			return;
		}
		serving = true;
		
		Thread captureThread = new Thread(new Runnable() {
			@Override
			public void run() {
			    capture();
			}
	    });
	    captureThread.setName("Range Finder Thread");
	    captureThread.start();
	}
	
	private static void capture() {
		byte control;
		int distance;
		while (true) {
			control = port.read(1)[0];
			if (control == 'R') {
				distance = Integer.parseInt(new String(port.read(3)));
				range.set(distance);
			}
		}
	}

	public static int getInches() {
		return range.intValue();
	}

}
