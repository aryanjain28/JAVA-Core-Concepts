public class Test
{
	Test()
	{
		//In Java, Strings uses a concept called String-Pool concept;
		//Every time a string is entered, it is stored in a pool full of strings
		//and the object is pointing towards the respective string.
		
		//If an String is changed than the object checks whether the string is
		//already present in the pool or not, if it is present than points to the new create
		//string else it creates a new string, stores it in the pool and points it.
		//This is why strings are immutable
		
		
		String S1 = new String("Hello.");
		String S2 = new String("Hello.");
		
		if(S1.hashCode() == S2.hashCode())
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		//Result will be Equal. Because though objects are different
		//but they are pointing to the same String in string pool.
	}
	public static void main(String[] args) 
	{
		Test O = new Test();
	}
}
