package chow;

/**
 * PerfectIntegers.java
 * This program prints out perfect integers
 * 2017/04/21
 * @author Angela Chow
 */

public class PerfectIntegers {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			if(isPerfectInteger(i)==true){
				System.out.println(i);
			}
		}
	}

	/**
	 * This method determines if a number is a perfect number
	 * @param i is the number that is being checked to see if it is a perfect integer
	 * @return true if number is a perfect integer, and false if it is not a perfect integer
	 */

	public static boolean isPerfectInteger(int i){
		int total=0;
		for(int n = i - 1; n>=1; n--){
			if(isDivisible(i,n)){
				total = total +n;
			}
		}
		if(total==i){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * This method checks to see if the values divided will have a remainder or not
	 * @param i is the input number
	 * @param n is the input number
	 * @return true if there is no remainder, and false if there is a remainder
	 */

	public static boolean isDivisible(int i, int n){
		if(i%n==0){
			return true;
		}
		return false;
	}
}
