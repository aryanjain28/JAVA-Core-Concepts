// final keyword can be used with a variables, classes and even methods.
// using final with different entities has different meanings.

final class Test1
{
	// Using final with classes** just means that class cannot be inherited.
	//**All the methods in a final class are by-default final
	//For eg. : 
}

public class Test extends Test1 //here this will give us error.
{	
}
