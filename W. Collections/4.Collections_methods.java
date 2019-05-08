import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		Character[] A = {'@','2','j'};
		List<Character> l = Arrays.asList(A);
		System.out.println(l);
		
		//reverse method
		Collections.reverse(l);
		System.out.println(l);
		
		//copy method
		Character[] Ccopy = new Character[3];
		List<Character> lcopy = Arrays.asList(Ccopy);
		Collections.copy(lcopy, l);
		System.out.println(lcopy);
	}
}
