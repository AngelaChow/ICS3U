import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

/**
 * Program3.java
 * This program rotates four revolutions forward and displays the tachocount number
 * 2017/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class Program3 {

	public static void main(String[] args) {
		LCD.drawString("Program 3", 0, 0);
		int tachocount =0;
		Motor.B.setSpeed(720);
		while( tachocount <=1440){ //1440 is 4 revolutions of 360 degrees
			Motor.B.forward(); //maybe use rotate class up to 1440 instead
			tachocount = Motor.B.getTachoCount();
		}
		LCD.drawInt(tachocount, 0, 1);
		Motor.B.rotateTo(0);
		tachocount = Motor.B.getTachoCount();
		LCD.drawInt(tachocount, 0, 2);
		Motor.B.stop();
		Button.waitForAnyPress();	
	}
}