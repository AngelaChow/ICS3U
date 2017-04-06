package chow;

import java.util.Scanner;

/**
 * LargestNumber.java
 * This program displays the largest number the user inputs
 * 2017/04/03
 * @author Angela Chow
 */

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, please enter three whole numbers.");
		int[] n = new int[3];
		for(int a=0; a<n.length; a++){
		 n[a]=sc.nextInt();
		}
		System.out.println("The largest number is: " + largestNum(n));
	}
	
	/**
	 * This method finds the largest number
	 * @param array that stores that three given numbers
	 * @return the largest given number
	 */
	public static int largestNum(int[] array){
		int largestNumber = array[0];
		for(int i=1; i< array.length; i++){
			if (array[i]>largestNumber){
				largestNumber=array[i];
			}
		}
		return largestNumber;
	}
}
