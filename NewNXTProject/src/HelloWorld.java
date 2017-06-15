import lejos.nxt.Button;
import lejos.nxt.Motor;

/**
 * HelloWorld.java
 * This is an experimental program for testing the different functions of the robot
 * 2017/06/05
 * @author Angela Chow & Alyssa Nodello
 */

public class HelloWorld {

	public static void main(String[] args) {
	//rotate clockwise
	Motor.C.setSpeed(360);
	Motor.C.forward();
	//rotate counter clockwise
//	Motor.B.setSpeed(360);
//	Motor.B.forward();
	//move backwards
//	Motor.C.setSpeed(360);
//	Motor.C.backward();
//	Motor.B.setSpeed(360);
//	Motor.B.backward();
	System.out.println("Hello World!");
	Button.waitForAnyPress();
	}
}
//Motor.C.setSpeed(360);
//Motor.C.forward();
//Motor.B.setSpeed(360);
//Motor.B.forward();
