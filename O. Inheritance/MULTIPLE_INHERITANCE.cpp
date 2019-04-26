interface Interface1
{
	void method1();
}

interface Interface2
{
	void method2();
}

class SuperClass
{
	void method3()
	{
		System.out.println("Method of Superclass");
	}
}

//we can access multiple inheritance
//using interfaces.
public class SubClass extends SuperClass implements Interface1, Interface2
{
	public static void main(String[] args) 
	{
		SubClass O = new SubClass();
		O.method3();
		O.method1(); //Accessed
		O.method2(); //Accessed
	}

	public void method1() 
	{
		System.out.println("INTERFACE 1");
	}

	public void method2() 
	{
		System.out.println("INTERFACE 2");		
	}
}
