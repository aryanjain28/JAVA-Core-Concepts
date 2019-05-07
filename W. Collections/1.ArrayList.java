import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Solution
{
	String name;
	int age;
	double sal;
	
	public Solution(String name, int age, double sal) 
	{
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public static void main(String[] args) 
	{
		Solution O1 = new Solution("John", 21, 76.77);
		Solution O2 = new Solution("Paul", 13, 876.78);
		Solution O3 = new Solution("Bucky", 22, 79.57);
		Solution O4 = new Solution("Sam", 14, 98.57);
		
		List<Solution> list1 = new ArrayList<Solution>();
		
		list1.add(O1);
		list1.add(O2);
		list1.add(O3);
		list1.add(O4);
		
		editlist(list1);
		
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
			
	}
	
	public static void editlist(Collection<Solution> l1) 
	{
		Iterator<Solution> it = l1.iterator();
		
		while(it.hasNext())
			if(it.next().age < 18)
				it.remove();
	}
	
	public String toString()
	{
		return name + " " + age + " " + sal;
	}
}
