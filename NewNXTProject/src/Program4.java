import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

/**
 * Program4.java
 * This program moves backward for four revolutions and display tachocount number
 * 2017/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class Program4 {

	public static void main(String[] args) {
		LCD.drawString("Program 4", 0, 0);
		int button;
		int tachocount =0;
		Motor.B.setSpeed(360);
		while( tachocount >=-1440){ 
			Motor.B.backward(); 
			tachocount = Motor.B.getTachoCount();
			LCD.drawInt(tachocount, 0, 1);
			button = Button.readButtons();
			if (button > 0){
				Motor.B.stop();
				break;
			}
		}
		//		button = Button.readButtons();
		//		if (button > 0);
		//		Motor.B.stop();
		Motor.B.stop();
		tachocount = Motor.B.getTachoCount();
		LCD.drawInt(tachocount, 0, 2);	
		Button.waitForAnyPress();
	}

}
//need to fix
