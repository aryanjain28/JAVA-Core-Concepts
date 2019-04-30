import java.util.Random;

public class Solution
{
	//All elements are set to 0 in case of int data-type in an array.
	//All elements are set to 0.0 in case of double data-type in an array.
	//All elements are set to false in case of boolean data-type in an array.
	//All elements are set to null in case of user-defined data-type in an array.
	
	public static void main(String[] args) 
	{
		int i [] = new int [20];
		double d [] = new double [20];
		boolean b [] = new boolean[20];
		Solution S [] = new Solution[20];
		
		System.out.println(i[12]);
		System.out.println(d[2]);
		System.out.println(b[14]);
		System.out.println(S[12]);
	}
}
