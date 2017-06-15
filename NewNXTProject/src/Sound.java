import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;

/**
 * Sound.java
 * This program senses nearby sound and reacts to it by moving forward or backward
 * 2017/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class Sound {

	public static void main(String[] args) {
		SoundSensor sound = new SoundSensor(SensorPort.S2,true);
		int button = Button.readButtons();
		int count = 0;
		Motor.B.setSpeed(360);
		while(button == 0){
			int reading = sound.readValue();
			if(reading >40){
				count = count +1;
			}
			if (count%2 == 0 && count >1){
				Motor.B.forward();
			}
			else if(count%2 == 1){
				Motor.B.backward();
			}
			button = Button.readButtons();
		}
		Motor.B.stop();
	}
}
