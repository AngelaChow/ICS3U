import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

/**BasicMovement.java
 * This program moves the robot forward and backward
 * 2017/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class BasicMovement {

	public static void main(String[] args) {
		LCD.drawString("Program 1", 0, 0);
		Button.waitForAnyPress();
		Motor.B.forward();
		LCD.drawString("FORWARD", 0, 0);
		Button.waitForAnyPress();
		Motor.B.backward();
		LCD.drawString("BACKWARD", 0, 0);
		Button.waitForAnyPress();
		Motor.B.stop();
	}
}
