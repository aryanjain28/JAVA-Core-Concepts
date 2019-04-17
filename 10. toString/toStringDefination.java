// toString is a built-in method in java
// it is quite useful.

class Test
{	
	// it is used for STRING REPRESENTATION of an object
	// we can edit this toString method according to our wish.
	
	public static void main(String[] args) 
	{
		Test TestObject = new Test();
		System.out.println(TestObject); //to print String representation of an object.
	}
	
	//return type will be string.
	
	public String toString()
	{
		return String.format("This is object of class.", null);
		
		// return String.format(format, args);
		// return "This is object of class."
	}
}
