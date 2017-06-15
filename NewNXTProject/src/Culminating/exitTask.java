package Culminating;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

/**
 * exitTask.java
 * This class exits the program when button is clicked
 * 2017/06/15
 * @author Angela Chow
 */

public class exitTask implements Behavior {

	/**
	 * no parameter
	 * returns true if the escape button is pressed and this exits the program
	 * returns false if the escape button is not pressed
	 */
	public boolean takeControl(){
		if(Button.ESCAPE.isDown())
			return true;

		return false;
	}

	/**
	 * no parameter
	 * stops robot
	 */
	public void action(){
		System.exit(0);
	}

	/**
	 * no parameter
	 */
	public void suppress(){
		
	}
}
