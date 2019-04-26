public class Test
{
	public static void main(String[] args) 
	{
		//1.
		//length( ) and capacity( ): 
		//The length of a StringBuffer can be found by the length( ) method, 
		//while the total allocated capacity can be found by the capacity( ) method.
		
		StringBuffer S1 = new StringBuffer("Something");
		System.out.println(S1.length() + " " + S1.capacity());
		
		//2.
		//append()
		StringBuffer S2 = new StringBuffer("Personal ");
		StringBuffer S3 = new StringBuffer("Account");
		System.out.println(S2.append(S3));
		
		//3.
		//insert()
		StringBuffer S4 = new StringBuffer("Use 4 law");
		System.out.println(S4.insert(5, "th"));
		
		//4.
		//reverse( ): It can reverse the characters within a StringBuffer 
		//object using reverse( ).This method returns the reversed object on 
		//which it was called. 
		StringBuffer S5 = new StringBuffer("Sheep");
		System.out.println(S5.reverse());
		
		/*There are many more methods.*/
	}
}
