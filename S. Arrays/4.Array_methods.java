import java.util.Random;

public class Solution
{
	//Array members.
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int b[];
		
		//length method : returns int value of size defined.
		System.out.println(a.length); // :: 5
		
		//clone method
		//now b is same as a
		b = a.clone();
		System.out.println(b.length); // :: 5		
	}
}
