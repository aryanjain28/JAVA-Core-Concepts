import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		System.out.println(findMax("Zack", "Cody", "Andrew"));
		System.out.println(findMax(1,2,3));
		System.out.println(findMax('a', 'v', 'b'));
		System.out.println(findMax(true, false, true));
	}
	
	public static <T extends Comparable<T>> T findMax(T a, T b, T c)
	{
		T max = a;
		
		if(b.compareTo(max) > 0)
			max = b;
		
		if(c.compareTo(max) > 0)
			max  = c;
		
		return max;
	}
}
