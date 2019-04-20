// final keyword can be used with a variables, classes and even methods.
// using final with different entities has different meanings.

class Test1
{
	// Using final with method means that method cannot be overridden.
	final void method()
	{
	}
}
public class Test extends Test1 
{	
		void method()  //here this will give us error.
		{
			
		}
}

