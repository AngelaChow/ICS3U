import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

/**
 * Ultrasonic.java
 * This program senses the distance between the robot and the object around, if it is too close it will move away from it in a different direction
 * 2017/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class Ultrasonic {

	public static void main(String[] args) {
		UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S1);
		int button = Button.readButtons();
		sonar.continuous();
		int distance = sonar.getDistance(); //25cm
		Motor.B.setSpeed(360);
		Motor.C.setSpeed(360);
		while(button == 0){
			distance = sonar.getDistance();
			if(distance >25){
				Motor.B.forward();
				Motor.C.forward();
			}
			if(distance <= 25){
				Motor.B.stop();
				Motor.C.stop();
				Delay.msDelay(500); 
				Motor.B.forward();
				Delay.msDelay(1000);
			}
			button=Button.readButtons();
		}
		Motor.B.stop();
		Motor.C.stop();
	}
}
