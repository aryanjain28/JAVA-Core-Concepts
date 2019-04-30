import java.util.*;

public class Solution
{
	//Multidimentional array is an array inside each element of outer-array.
	public Solution() 
	{
		int x[][] = new int [5][3]; //Now each of the 5 elements can store an array
									// of 3 elements.
		
		Random R = new Random(); //random number generator
		
		for(int i=0; i<5; i++)
			for(int j=0; j<3; j++)
				x[i][j] = R.nextInt(); //random int number
		
		System.out.println("\n\nVALUES : \n\n");
		
		for(int i=0; i<5; i++)
			for(int j=0; j<3; j++)
				System.out.println(x[i][j]);  //5x3=15 values.
		
	}
	
	public static void main(String[] args) 
	{
		Solution S = new Solution();
	}
}
