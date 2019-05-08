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
	}
}
