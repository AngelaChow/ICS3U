package chow;

/**
 * PythagoreanTriple.java
 * This program prints out pythagorean triples
 * 2017/04/20
 * @author Angela Chow
 */

public class PythagoreanTriple {

	public static void main(String[] args) {
		System.out.println("Hello, this program will output pythagorean triples.");
		for(int a = 1; a< 100; a++){
			for (int b = 1; b< 100; b++){
				int c= (int)Math.pow(a,2) + (int)Math.pow(b, 2);
				if (perfectSquare(c) == true){
					c = (int)Math.sqrt(c);
					System.out.println(a + " " + b + " " +c);	
				}
			}
		}
	}     
	
	/**
	 * This method does a check to see if c is a perfect square
	 * @param d is the number that is tested for the perfect square from the main method
	 * @return true if value is a perfect square and false if it isn't
	 */
	public static boolean perfectSquare(int d){
		int x = (int)Math.sqrt(d);
		double check = (int) Math.pow(x,2);
		if(check==d){
			return true;
		}
		else{
			return false;
		}
	}
}
