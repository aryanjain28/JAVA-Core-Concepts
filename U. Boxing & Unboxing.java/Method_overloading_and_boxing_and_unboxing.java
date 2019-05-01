public class Solution
{
	/*
	 * In method overloading, while passing values, there can be two types of data-types
	 * PRIMITIVE data type & REFERENCE. When we change primitive data type to reference then
	 * it is called boxing. And  when we change reference to primitive then
	 * it is called un-boxing.
	 */
	
	/*
	 * With method overloading when we pass primitive data type compiler first checks the method
	 * with same data type. If found, it selects that method, else goes for reference of same type.
	 */
	
	public static void conversion(int a)
	{
		System.out.println("Int value.");
	}
	
	public static void conversion(Integer b)
	{
		System.out.println("Integer value.");
	}
	/*
	 * If no same primitive data-type or reference is found.
	 * Compiler goes for similar data type.
	 * For eg. int or integer goes for double or float.
	 */
	
	public static void main(String[] args) 
	{
		int a = 12;
		Integer b = 34;
		
		//If we will remove any of the above method, then method overloading will still work.
		conversion(a); 
		conversion(b);
	}
}
