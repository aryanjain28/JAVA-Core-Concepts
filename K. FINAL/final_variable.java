// final keyword can be used with a variables, classes and even methods.
// using final with different entities has different meanings.
public class Test
{
// Using final with variable* means it can be initialized just once.
// A final variable can only be initialized inside a constructor or there itself.
//For eg. : 
	
	
	//x can be initialized here itself :: final int x = 10;
	final int x;
	
	public Test() 
	{
		//or it can be initialized here.
		x = 10;
	}
}
