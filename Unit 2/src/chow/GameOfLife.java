package chow;

import java.util.Scanner;

public class GameOfLife {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the game of life!");
		int [][] grid = new int [20][20];
		int x=0;
		int y=0;
		int i=0;
		int j=0;

		for( i= 0; i<grid.length; i++){
			for(j=0; j<grid[i].length; j++){
				grid[i][j]=0; //The 0's show the dead creatures
			}

			System.out.println("How many live cells would you like?");
			int liveCells =sc.nextInt();
			for(int counter=1; counter<=liveCells; counter++){
				System.out.println("Please enter an x and y value. X will be the row, Y will be the column.");
				x =sc.nextInt();
				y =sc.nextInt();
				if (i==x && j==y){
					grid[i][j] = 1;
				}
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}

	}	
}
//Still need to figure out how to get more than one output to work

