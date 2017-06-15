import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

/**
 * Program5.java
 * This program moves the motors forward and repeats for eight rounds displaying the tachocount number ever 200 ms
 * 2017/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class Program5 {

	public static void main(String[] args) {
		LCD.drawString("Program 5", 0, 0);
		Motor.B.setSpeed(720);
		Motor.C.setSpeed(720);
		for (int j =0; j<8; j++){
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(200);
			LCD.drawString( Motor.B.getTachoCount()+ " "+ Motor.C.getTachoCount(), 0, j+1);
		}
		Motor.B.stop();
		Motor.C.stop();
		Button.waitForAnyPress();
	}
}
