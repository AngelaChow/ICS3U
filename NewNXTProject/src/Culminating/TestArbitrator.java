package Culminating;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

/**
 * TestArbitrator.java
 * This is the main class that contains the array of behaviors
 * 2016/06/15
 * @author Angela Chow
 */
public class TestArbitrator{
	public static void main(String[] args){
		//used constructors
		LightSensor light = new LightSensor(SensorPort.S3); //another light sensor is needed
		SoundSensor sound= new SoundSensor(SensorPort.S2);
		Behavior b1 = new driveForward();
		Behavior b2 = new blackRocks(light);
		Behavior b3 = new lightRocks(light);
		Behavior b4 = new darkPath(light);
		Behavior b5 = new lightPath(light);
		Behavior b6 = new thunderSound(light, sound);
		Behavior b7 = new exitTask();

		Behavior[] behaviors = {b1,b2,b3,b4,b5,b6,b7}; //array that has the behaviors ranked from lowest to highest priority

		Arbitrator arby = new Arbitrator(behaviors);
		arby.start();
	}
}

