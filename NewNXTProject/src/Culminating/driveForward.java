package Culminating;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

/**
 * driveForward.java
 * This class keeps the robot driving forward at all time
 * 2017/06/15
 * @author Angela Chow
 */

public class driveForward implements Behavior {

	private boolean suppressed = false;

	/**
	 * no parameter
	 */
	public void suppress(){
		suppressed=true;
	}

	/**
	 * no parameter
	 * always driving forward/lowest priority
	 */
	public boolean takeControl(){
		return true; 
	}

	/**
	 * no parameter
	 * Sets the robot speed to 180 and keeps it moving until another behavior is met
	 */
	public void action(){
		suppressed=false;
		Motor.B.setSpeed(180);
		Motor.C.setSpeed(180);
		Motor.B.forward();
		Motor.C.forward();
		while(!suppressed){
			Thread.yield();
		}
		Motor.B.stop();
		Motor.C.stop();
	}
}
