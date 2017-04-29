package chow;

import java.util.Scanner;

/**
 * GameOfLife.java
 * This program acts as the game of life application. The user inputs where they would like live cells to be placed, and as they continue the game, they cells are either kept alive or die.
 * 2017/04/24
 * @author Angela Chow
 */

public class GameOfLife {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO THE GAME OF LIFE!");
		System.out.println("The following game has 0's that represent the dead cells and 1's that represent the alive cells");
		System.out.println("If the entire grid is 0, it mean's that all the cells are dead.");
		int [][] grid = new int [20][20]; //grid is 20x20
		boolean[][]newGrid = new boolean[20][20]; //new generation grid is 20x20 but this will never be painted
		int x=0;//x coordinate
		int y=0;//y coordinate
		int i=0;//row
		int j=0;//column
		String answer;

		for( i= 0; i<grid.length; i++){
			for(j=0; j<grid[i].length; j++){
				grid[i][j]=0; //the 0's are the dead creatures/cells
			}
		}
		
		System.out.println("How many live cells would you like?");
		int liveCells =sc.nextInt();
		for(int counter=0; counter<liveCells; counter++){
			System.out.println("Please enter an X value.(This is the row value)"); 
			x =sc.nextInt();
			System.out.println("Please enter an Y value.(This is the column value)");
			y =sc.nextInt();
			grid[x][y] = 1; //the 1's are the alive creatures/cells
		}
		
		for(i=0;i<grid.length; i++){
			for(j=0; j<grid[i].length; j++){
				System.out.print(grid[i][j] +"  ");	
			}
			System.out.println();
		}

		int surrounding=0; //neighboring cells around the inputed cells
		do{
			for(i=0; i<=19; i++){
				for(j=0;j<=19;j++){
					surrounding=0;
					if(i>0){//cell above
						if(grid[i-1][j]==1) 
							surrounding++;
					}
					if(i<19){//cell below
						if(grid[i+1][j]==1)
							surrounding++;
					}
					if(j>0){//cell left
						if(grid[i][j-1]==1)
							surrounding++;
					}
					if(j<19){//cell right
						if(grid[i][j+1]==1)
							surrounding++;
					}
					if(i>0&&j>0){//cell diagonal up left
						if(grid[i-1][j-1]==1)
							surrounding++;	
					}
					if(i>0&&j<19){//cell diagonal up right
						if(grid[i-1][j+1]==1)
							surrounding++;
					}
					if(i<19&&j>0){//cell diagonal down left
						if(grid[i+1][j-1]==1)
							surrounding++;
					}
					if(i<19&&j<19){//cell diagonal down right
						if(grid[i+1][j+1]==1)
							surrounding++;
					}
					if(grid[i][j]==1){//checks the neighboring cells
						if(surrounding == 2 || surrounding == 3){
							newGrid[i][j]=true;
						}
						else{
							newGrid[i][j]=false;
						}
					}
					else if(grid[i][j]==0){
						if(surrounding == 3){
							newGrid[i][j]=true;
						}
						else{
							newGrid[i][j]=false;
						}
					}
				}
			}
			System.out.println("The following grid below is the new generation:");
			for(i=0;i<=19;i++){
				for(j=0;j<=19; j++){
					if(newGrid[i][j]==true){
						grid[i][j]=1;
						System.out.print(grid[i][j] +"  ");
					}
					else{
						grid[i][j]=0;
						System.out.print(grid[i][j] +"  ");
					}	
				}
				System.out.println();
			}
			System.out.println("Enter 'yes' to continue and 'no' to quit");//asks if user wants to see the future generations or not
			answer=sc.next();
			while(true){//checks to see if the user inputed the proper spelling of the given options
				if(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")){//case ignored-can be lower case or upper case
					break;
				}
				else{
					System.out.println("Sorry, input was invalid, please make sure you correctly type in 'yes' or 'no'.");//if user input is not proper, this line prints asking them to input again
					answer=sc.next();
				}
			}
			
		}while(!answer.equalsIgnoreCase("no"));
		
		System.out.println("Thank you for playing, the game has ended.");//End of the game
	}
}