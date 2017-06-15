import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.util.Delay;

/**Light.java
 * This program scans the light around and moves depending on the brightness of the light
 * 2019/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class Light {

	public static void main(String[] args) {
		LightSensor light = new LightSensor (SensorPort.S3);
		light.getLightValue();
		int sensorReading;
		int button = Button.readButtons();
		while(button == 0){
			Motor.B.setSpeed(360);
			Motor.C.setSpeed(360);
			Motor.B.forward();
			Motor.C.forward();
			sensorReading = light.getLightValue();
			if(sensorReading > 50 ){
				Motor.B.stop();
				Delay.msDelay(500);
				Motor.B.forward();
			}
			sensorReading = light.getLightValue();
			button = Button.readButtons();
		}
		Motor.B.stop();
		Motor.C.stop();
	}
}
