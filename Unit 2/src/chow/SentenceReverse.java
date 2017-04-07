package chow;
import java.util.Scanner;


public class SentenceReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String [] myString=sc.nextLine().split(" ");
		for (int i=0; i<myString.length;i++){
			for (int a=myString[i].length()-1;a>=0;a--){
					System.out.print(myString[i].charAt(a));	
				}
			
			System.out.print(" ");
			}
			
		}
		
	}


