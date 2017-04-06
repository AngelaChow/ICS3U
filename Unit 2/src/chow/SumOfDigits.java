package chow;

import java.util.Scanner;

/**
 * SumOfDigits.java
 * This program calculates to sum of a digit from what the user inputs
 * 2017/04/03
 * @author Angela Chow
 */
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, please enter a whole number.");
		int n = sc.nextInt();
		System.out.println("The sum of the digit you entered is: " + sumOfDigits(n));
	}
	
	/**
	 * This method finds the sum of the digit
	 * @param x is the input number
	 * @return the total of the digit given
	 */
	public static int sumOfDigits(int x){
		int total = 0;
		while (x>0){
			total = total + x % 10;
			x = x/10;
		}
		return total;
	}
}
