import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

/**
 * Tachometer.java
 * This program prints tachocount numbers while it moves forward
 * 2017/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class Tachometer {

	public static void main(String[] args) {

		LCD.drawString("Program 2", 0, 0);
		Motor.B.setSpeed(720);
		Motor.B.forward();
		Delay.msDelay(2000);
		int tachocount;
		tachocount = Motor.B.getTachoCount();
		LCD.drawInt(tachocount, 0, 0);
		Motor.B.stop();
		tachocount = Motor.B.getTachoCount();
		LCD.drawInt(tachocount, 0, 1);
		while(tachocount >=0){
			Motor.B.backward();
			tachocount = Motor.B.getTachoCount();
		}
		LCD.drawInt(tachocount, 0, 2);
		Motor.B.stop();
		tachocount = Motor.B.getTachoCount();
		LCD.drawInt(tachocount, 0, 3);
		Button.waitForAnyPress();
		Motor.B.stop();
	}
}
