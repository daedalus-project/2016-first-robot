package org.team2839.robot2016.utils;

import java.util.HashMap;

public class Sleeper {

	private static HashMap<String, Double> timers;

	public static void startTimer(String timerName, double elapsedTime) {
		double endTime = (double) (System.currentTimeMillis() / 1000L) + elapsedTime;
		timers.put(timerName, endTime);
	}

	public static void cancelTimer(String timerName) {
		if (timers.containsKey(timerName)) {
			timers.remove(timerName);
		}
	}

	public static boolean timerRunning(String timerName) {
		return timers.containsKey(timerName);
	}

	public static boolean timesUp(String timerName) {
		double endTime = timers.getOrDefault(timerName, 0.0);
		if ((double) (System.currentTimeMillis() / 1000L) > endTime) {
			timers.remove(timerName);
			return true;
		} else {
			return false;
		}
	}

}
