class Test1
{
	void method1()
	{
		System.out.println("Method 1");
	}
}

class Test2 extends Test1
{
	void method2()
	{
		System.out.println("Method 2");
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		/*
		 * IMPORTANT : 
		 * In Java, all non-static methods are based on the runtime 
		 * type of the underlying object rather than the type of the reference, 
		 * that points to that object. 
		 * Therefore, it doesn’t matter which type you use in the 
		 * declaration of the object, 
		 * the behavior will be the same.
		 */

		//Reference of SUB :: OBJECT of SUB
		Test2 O2 = new Test2();
		//Here, as reference of subclass is created therefore 
		//we can have access to both superclass
		//and subclass members i.e. variables & method.
		O2.method1();
		O2.method1();
		
		
		
		//Reference of SUPER :: OBJECT of SUB
		Test1 O1 = new Test2();
		//Here, as reference of superclass is created therefore 
		//we can have access to only those members present in
		//superclass.
		O1.method1();

		//		O1.method2(); this will give error.
		
		//IMP : If method is overridden then whatever reference we use
		//(either subclass or superclass), it will always be the overridden 
		//method in subclass that will be executed.
		
		
	}
}
