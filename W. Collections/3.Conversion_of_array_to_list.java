import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution
{
	public static void main(String[] args) 
	{
		String[] names = {"John", "Paul", "Sam", "Bucky"};
		
		//converting array to list
		LinkedList<String> l = new LinkedList<String>(Arrays.asList(names));
		
		l.addLast("LastName");
		l.addFirst("FirstName");
		l.add(2, "MiddleName");
		
		//converting list to array
		names = l.toArray(names);
		
		for(String x : names)
			System.out.println(x);
	}
}
