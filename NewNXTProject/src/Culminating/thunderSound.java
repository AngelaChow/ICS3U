package Culminating;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * thunderSound.java
 * This class detects a sound, and when it hears a sound it will return back to the home base
 * 2017/06/15
 * @author Angela Chow
 */

public class thunderSound implements Behavior {

	public boolean suppressed = false;
	private SoundSensor sound;
	private LightSensor light;

	public thunderSound(LightSensor ls, SoundSensor ss){
		this.light = ls;
		this.sound = ss;
	}

	/**
	 * no parameter
	 */
	public void suppress(){
		suppressed= true;
	}

	/**
	 * no parameter
	 * returns true if the sound range is greater than 40
	 * returns false if condition is not met
	 */
	public boolean takeControl(){
		if(sound.readValue()>40){
			return true;
		}
		return false;
	}

	/**
	 * no parameter
	 * If the takeControl() method returns true, it will go to the action() method
	 * This stops the robot when it hears a sound, then moves the robot back to home base when the base color is scanned
	 */
	public void action() {
		suppressed = false;
		Motor.B.stop();
		Motor.C.stop();
		Delay.msDelay(1000);
		Motor.B.setSpeed(180);
		Motor.C.setSpeed(180);
		Motor.B.forward();
		Motor.C.forward();
		if((light.getLightValue()>46 && light.getLightValue()<49) || (light.getLightValue()>27 && light.getLightValue()<31)){
			Motor.B.stop();
			Motor.C.stop();
			Delay.msDelay(500);
			Motor.B.forward();
			Motor.C.forward();
			if(light.getLightValue()>44 && light.getLightValue()<45){//home base
				Motor.B.stop();
				Motor.C.stop();
			}
		}
		while(!suppressed){
			Thread.yield();
		}
	}
}