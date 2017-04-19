package chow;

import java.util.Scanner;
/**
 * IsPalindrome.java
 * This program determines if a word is a palindrome or not
 * 2017/04/19
 * @author Angela Chow
 */
public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word that will then be determined if it is a palindrome or not.");
		String word = sc.nextLine();
		System.out.println(isPalindrome(word));
	}

	/**
	 * This method determines if the word inputed is a palindrome or not
	 * @param word is the word that the user inputs
	 * @return true if word is a palindrome and false if the word isn't a palindrome
	 */

	public static boolean isPalindrome(String word){
		for(int i=0; i< word.length();i++){
			if(word.charAt(i) != word.charAt(word.length()-1-i)){
				return false;
			}
		}
		return true;
	}
}
