package chow;

public class PythagoreanTriple {

	public static void main(String[] args) {
		System.out.println("Hello this program will output all the pythagorean triples between 1 and 100.");
		for(int a = 1; a<100; a++){
			for (int b = 1; b<100; b++){
				int c = (int)Math.pow(a,2) + (int)Math.pow(b, 2);
				if (perfectSquare(c)==true){
					int x=(int)Math.sqrt(c);
					System.out.println(a + b + c);	
				}
			}
		}
	}                                                                                                                                             
	//This method determines if c is a perfect square
	public static boolean perfectSquare(int x){
		int check = (int) Math.pow(x,2);
		if(check==x){
			return true;
		}
		else{
			return false;
		}
	}
}
