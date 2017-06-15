package Culminating;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * darkPath.java
 * This class scans the black path
 * 2017/06/15
 * @author Angela Chow
 */

public class darkPath implements Behavior{
	public boolean suppressed = false;
	private LightSensor light;

	public darkPath(LightSensor ls){
		this.light = ls;
	}
	
	/**
	 * no parameter
	 */
	public void suppress(){
		suppressed = true;
	}
	
	/**
	 * no parameter
	 * returns true if the light values is between 27-31%
	 * returns false if condition is not met
	 */
	public boolean takeControl(){
		if(light.getLightValue()>27 && light.getLightValue()<31){
			return true;
		}
		return false;
	}
	
	/**
	 * no parameter
	 * If the takeControl() method returns true, it will go to the action() method
	 * This continues to move the robot forward until it finds the dark path
	 */
	public void action(){
		suppressed = false;
		Motor.B.setSpeed(180);
		Motor.C.setSpeed(180);
		Motor.B.forward();
		Motor.C.forward();
		if(light.getLightValue()>46 && light.getLightValue()<49){
			Motor.B.stop();
			Motor.C.stop();
			Delay.msDelay(500);
			Motor.A.rotate(-70);
		}
		
		while(!suppressed){
			Thread.yield();
		}
	}
}