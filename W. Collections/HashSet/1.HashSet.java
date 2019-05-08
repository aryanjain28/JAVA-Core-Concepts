import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		//sets does not allow similar data to be present in it
		//for sorting go for treeset
		//random order
		//it uses binary search
		
		String[] names = {"John", "Aryan", "Bob", "Aryan", "Paul", "Paul", "Paul"};
		List<String> l = Arrays.asList(names);
		
		Set<String> S1 = new HashSet<String>(l);//cannot directly take array.
		System.out.println(S1); //removed ::  Aryan, Paul, Paul
		
		Set<String> S2 = new TreeSet<String>(l); //automatically sorts list
		System.out.println(S2);
	}	
}
