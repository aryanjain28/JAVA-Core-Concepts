import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Solution
{
	public static void main(String[] args) 
	{
			String[] animals1 = {"Goat", "Dog", "Cat", "Pig", "Horse"};
			String[] animals2 = {"Elephant", "Tiger", "Lion", "Cow"};
			
			List<String> l1 = new LinkedList<String>();
			List<String> l2 = new LinkedList<String>();
			
			for(String x : animals1)
				l1.add(x);
			
			for(String y : animals2)
				l2.add(y);
			
			l1.addAll(l2);
			l2 = null;
			
			printList(l1);
			System.out.println();
			removeList(l1, 2, 6);
			System.out.println();
			printList(l1);
			System.out.println();
			reverseList(l1);
	}
	
	private static void reverseList(List<String> l)
	{
		ListIterator<String> it = l.listIterator(l.size());
		while(it.hasPrevious())
			System.out.println(it.previous());
	}
	
	private static void removeList(List<String> l, int from, int to)
	{
		l.subList(from, to).clear();
	}
	
	private static void printList(Collection<String> l)
	{
		for(String x : l)
			System.out.println(x);
	}
}
