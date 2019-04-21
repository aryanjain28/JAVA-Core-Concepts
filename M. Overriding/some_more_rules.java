// Overriding and exception handling :: 

//#1. If the super-class overridden method does not throws any exception,
//subclass overriding method can only throws the unchecked exception,
//throwing checked exception will lead to compile-time error. 

//#2. If the super-class overridden method does throws an exception,
//subclass overriding method can only throw same, subclass exception. 
//Throwing parent exception in Exception hierarchy will lead to compile time error.
//Also there is no issue if subclass overridden method is not throwing any exception. 

class Test1
{
	void method1()
	{ }
	
	void method2()
	{ }
	
	void method3() throws ArithmeticException
	{ }
	
	void method4() throws RuntimeException
	{ }
}

public class Test extends Test1
{
	//no issue with checked exception::
	@Override
	void method1() throws ArithmeticException
	{ }
	
	@Override
	void method2() throws Exception //this gives error.
	{
		System.out.println("Test :: method2");
	}
	
	@Override
	void method3() // this will give no error
	{ }
	
	@Override
	//issue with throwing parent exception in hierarchy
	void method4() throws Exception
	{ 
		System.out.println("Test :: method4"); // this will give error.
	}
	
}
