package chow;

import java.util.Scanner;

/**
 * IsPrime.java
 * This program determines if a number is prime or not
 * 2017/04/04
 * @author Angela Chow
 */

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, please enter one whole number. If the number is a prime number, the output will be true. If the number isn`t a prime number, the output will be false.");
		int n = sc.nextInt();
		System.out.println(isPrime(n));
	}

	/**
	 * This method determines if the value inputed is a prime number or not
	 * @param a is the input number
	 * @return false if not a prime number, true ifa prime number
	 */

	public static boolean isPrime(int a){
		if (a<=0){
			return false;
		}
		else{		
			for(int counter=(int)Math.sqrt(a); counter>1; counter--){
				if(isDivisible(a,counter)){
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * This method checks to see if the values divided will have a remainder or not
	 * @param a is the input number
	 * @param b is the input number
	 * @return true if no remainder, false if there is a remainder
	 */

	public static boolean isDivisible(int a, int b){
		if(a%b==0){
			return true;
		}
		return false;
	}
}
