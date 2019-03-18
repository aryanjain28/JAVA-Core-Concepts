//Method overloading is a concept in which we can use
//same name for different methods under some conditions
//and the compiler will automatically reach for the desired method.

//Method overloading occurs when : (CONDITIONS basically!)
//		a.Change in number of arguments.
//		b.Change in return type.
//		c.Change in type of argument.

class ClassName
{	
	//	CASE  a.
	void method1()
	{
		System.out.println("Method 1 with no parameter");
	}
	
	void method1(int a)
	{
		System.out.println("Method 1 with 1 parameter");
	}
	
	//	CASE  b.
	int method2()
	{
		System.out.println("Method 2 with int-type return type");
		return 0;
	}
	
	double method2(int a)
	{
		System.out.println("Method 2 with double-type return type");
		return 0.0;
	}
	
	//	CASE c.
	void method3(double d)
	{
		System.out.println("Method 3 with argument-type int");
	}
	
	void method3(String x)
	{
		System.out.println("Method 3 with argument-type float");
	}
	
	
	static public void main(String [] args)
	{
		ClassName O = new ClassName();
		
		//calling methods with same name but different features.
		
		//case a
		O.method1();
		O.method1(99);
		
		//case b
		O.method2();
		O.method2(55);
		
		//case c
		O.method3(3.4);
		O.method3("JAVA");
	}
	
}
