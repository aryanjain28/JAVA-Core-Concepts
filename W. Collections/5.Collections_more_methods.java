import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		//addAll method
		String[] food = {"Pasta", "Noodles", "Biscuits"};
		List<String> list1 = Arrays.asList(food);

		String[] drink = {"Coke", "Tea", "Coffee"};
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(drink));
		
		Collections.addAll(list2, food);
		System.out.println(list2);
		
		//frequency method :: returns the number of times same element is present
		System.out.println(Collections.frequency(list2, "Pasta")); //returns 1
		
		//disjoint method :: return true if none of the element in two list is same.
		System.out.println(Collections.disjoint(list1, list2)); //returns false
	}
}
