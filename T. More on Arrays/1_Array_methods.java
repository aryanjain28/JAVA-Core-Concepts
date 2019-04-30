import java.util.Arrays;

public class Solution
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		if(a == b)
			System.out.println("Same");
		else
			System.out.println("Not same"); //output
		
		/*
		 * In Java, arrays are first class objects. 
		 * In the above program, a and b are two references 
		 * to two different objects. 
		 * So when we compare a and b, 
		 * two reference variables are compared, 
		 * therefore we get the output as “Not Same”.
		 */
		
		if(Arrays.equals(a, b)) //loops through each element and checks. 
			System.out.println("Same"); //output
		else
			System.out.println("Not same.");
	}
}
