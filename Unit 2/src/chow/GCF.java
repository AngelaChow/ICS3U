package chow;

import java.util.Scanner;

/**
 * GCF.java
 * This program finds the greatest common factor between two numbers
 * 2017/04/03
 * @author Angela Chow
 */
public class GCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, please enter a number.");
		int x = sc.nextInt();
		System.out.println("Please enter another number.");
		int y = sc.nextInt();
		System.out.println("The greatest common factor between your two numbers is " + gcf(x,y));
	}
	
	/**
	 * This method does the calculations to find the greatest common factor, which then gets returned back into the main method
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcf(int a, int b){
		int big= Math.max(a,b);
		int small=Math.min(a,b);
		int counter=small;
		if(a==0 || b==0){
			return 0;
		}
		while(isDivisible(big,counter)==false || isDivisible(small,counter)==false){
			counter--;
		}
		return counter;
	}
	
	/**
	 * This method checks to see if the values divided will have a remainder or not
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean isDivisible(int a, int b){
		if(a%b==0){
			return true;
		}
		return false;
	}
}
