package chow;

import java.util.Scanner;


/**
 * Factorial.java
 * This program finds the factorial of a number
 * 2017/03/30
 * @author Angela Chow
 */

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, please enter a number.");
		String s = scan.nextLine();
		int x = Integer.parseInt(s);
		System.out.println("The factorial of your number is "+factorial(x));
	}

	/**
	 * This method calculates to find the factorial of the number the user inputs
	 * @param x is the input number
	 * @return the factorial of the given number
	 */
	public static int factorial(int x){
		if (x<0){
			return -1;
		}
		else if(x==0){
			return 1;
		}
		else{
			int product=1;
			for(int i=x; i>1; i--){
				product = product * i;
			}
			return product;
		}
	}
}
