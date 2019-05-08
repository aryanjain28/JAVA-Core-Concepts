import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		//generic methods are very useful
		//they are used to remove overloaded methods
		//we can pass any type of data.
		
		String[] places = {"Mumbai", "Delhi", "Pune", "Goa"};
		Character[] C = {'@', 'A', 'a', '-'};
		Integer[] I = {1,2,3,4,5};
		Boolean[] B = {true, false, true, true, false};
		
		System.out.println("\n\nOne parameter : \n");
		
		printThis(places);
		printThis(C);
		printThis(I);
		printThis(B);
		
		System.out.println("\n\nTwo parameters : \n");
		
		printThisToo(places, B);
		printThisToo(C, B);
		printThisToo(I, C);
	}	
	public static <T> void printThis(T[] r) //syntax of generic method
	{
		for(T x : r)
			System.out.printf("%s ", x);
		System.out.println(" ");
	}
	
	public static <T, P> void printThisToo(T[] t, P[] p)
	{
		for(T x : t)
			System.out.printf("%s ", x);
		
		for(P x : p)
			System.out.printf("%s ", x);
		System.out.println(" ");
	}
}
