class ClassName
{	
	static int a;
	
	//static blocks are blocks of code written within a curly
	//braces with just static above them
	
	//these are the blocks which will run at the very first beginning of code
	//these are called even before the main method
	//due to this property they can be used to initialize variables.
	
	//these are blocks used to initialize varial
	
	static
	{
		a = 0;
		System.out.println("Hi I am a static block 1 !");
	}
	
	static
	{
		a = 0;
		System.out.println("Hi I am a static block 2 !");
	}
	
	//we can have more than one static block also
	//if we have multiple static block in our code than they will run sequentially
	
	static public void main(String [] args)
	{
		System.out.println("Hi I am main method.");
	}
}
