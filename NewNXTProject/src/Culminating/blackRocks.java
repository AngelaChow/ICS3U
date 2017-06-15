package Culminating;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * blackRocks.java
 * This class scans the black rocks
 * 2017/06/15
 * @author Angela Chow
 */
public class blackRocks implements Behavior
{

	private boolean suppressed = false;
	private LightSensor light;
	public blackRocks(LightSensor ls){
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
	 * returns true if the light values is between 20-35%
	 * returns false if condition is not met
	 */
	public boolean takeControl(){
		if(light.getLightValue()>20 && light.getLightValue()<35){//light value of the black ball
			return true;
		}
		return false;
	}
	
	/**
	 * no parameter
	 * If the takeControl() method returns true, it will go to the action() method
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
			Motor.B.stop(); //stops one of the motors then rotates around 
			Delay.msDelay(500);
			Motor.B.forward();
		}
		while(!suppressed){
			Thread.yield();
		}
	}
}