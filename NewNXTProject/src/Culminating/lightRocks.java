package Culminating;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * lightRocks.java
 * This class scans the white rocks
 * 2017/06/15
 * @author Angela Chow
 */
public class lightRocks implements Behavior{

	private boolean suppressed = false;
	private LightSensor light;

	public lightRocks(LightSensor ls){
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
	 * returns true if the light values is between 35-50%
	 * returns false if condition is not met
	 */
	public boolean takeControl(){
		if(light.getLightValue()>35 && light.getLightValue()<50){
			return true;
		}
		return false;
	}

	/**
	 * no parameter
	 * If the takeControl() methods returns true, it will go to the action() methods
	 * This stops the motors delays, than releases the arm to lock the back in and move the robot forward again
	 * If it scans the light value of the table it will stop and rotate around to go back into the platform
	 */
	public void action(){
		suppressed = false;
		Motor.B.stop();
		Motor.C.stop();
		Delay.msDelay(1000);
		Motor.A.rotate(70);
		Delay.msDelay(1000);
		Motor.B.setSpeed(180);
		Motor.C.setSpeed(180);
		Motor.B.forward();
		Motor.C.forward();
		if (light.getLightValue()>40 && light.getLightValue()<45){//light value of the table
			Motor.B.stop();
			Delay.msDelay(500);
			Motor.B.forward();
		}
		while(!suppressed){
			Thread.yield();
		}
	}
}
