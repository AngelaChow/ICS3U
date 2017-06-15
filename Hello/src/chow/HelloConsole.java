package chow;

import java.awt.Color;

import hsa_new.Console;

public class HelloConsole {
	/**Print a console with Hello and a red maple leaf
	 * 2017/02/24
	 * @param Angela Chow
	 */

	public static void main(String[] args) {
			Console c = new Console();
			c.println("Hello!");
			c.setColor(Color.red);
			c.drawMapleLeaf(10,50,100,100);
			c.fillMapleLeaf(10,50,100,100);
			
			
			
			
		

	}

}
