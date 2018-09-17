//imports scanner 
import java.util.Scanner;
// declares the name of the class and sets it to public
public class TwoDimensionalArrayDemo
{	
	//main shell of the program
	public static void main(String[] args)
	{
		//establising a multi dimensional array
		int[][] count = new int[6][6];
		//declares scanner as input
		Scanner input = new Scanner(System.in);
		//declare 2 integer variables with no value yet
		int row, column;
		//declares a constant variable that when user enter it will quit the program
		final int QUIT = 99;
		//Outputting a message to user
		System.out.print("Enter a row or " + QUIT + " to quit >");
		//Saving user input into a variable called row and giving it an integer value
		row = input.nextInt();
		
		//while statement that test if user input is not the constant to quit the program
		while(row != QUIT)
		{	
			//Outputting message to user 
			System.out.print("Enter a column > ");
			//saving the user input in a variable called column and giving it an integer value
			column = input.nextInt
			//if statement that tests if row and column to see if its less than the length of multidimensional array 
			if(row < count.length && column < count[row].length)
			{	
				//only when both are less than it will increment each by one
				count[row][column]++;
				//for loop that test the length of count
				for(int r = 0; r < count.length; ++r)
				{	
					//for loop that tests against the length of count at the index of the first for loop
					for(int c = 0; c < count[r].length; ++c)
						//prints count at the index of both for loops and adds an empty space
						System.out.print(count[r][c] + " ");
					//prints an empty line
					System.out.println();
				}
			}
		//else statement to the while loop
		else
			//if aything is out of the multi dimensional array it will print the following
			System.out.println("Invalid position selected");
				//Output the user to re enter a row or 99 to quit
				System.out.print("Enter a row or " + QUIT + " to quit > ");
				row = input.nextInt();
			
			
		}
	}
}
