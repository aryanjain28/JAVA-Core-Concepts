//#1. Private method are not overridden.
	
//#2. The method which is overriding should always have
// 	  equal or less access specifier than the one that is
//    being overridden.

//#3. Final methods cannot be overridden.

//#4. Static methods cannot be overidden.
//Remember shadowing.

//#5. Overriding methods should have same return type.

class Test1
{
	private void method1()
	{ }
	
	protected void method2()
	{ }
	
	final void method3()
	{ }
	
	//This static method in base class will be hidden in subclass.
	static void method4()
	{ System.out.println("Method 4 TEST===1"); }
}

public class Test extends Test1
{
	//can keep any access specifier here.
	// This wont be affected, because of point #1.
	private void method1()
	{ }
	
	//here we can only keep access specifier as
	// protected or public..
	protected void method2()
	{ }
	
//	void method3()  //this gives us error.
	{ }
	
	// this method hides.
	static void method4()
	{ System.out.println("Method 4 TEST "); }
	
	
	
	
	public static void main(String[] args) 
	{
			Test1 o2 = new Test();
			o2.method4(); // This should print "Method 4 TEST "
						  // but it prints "Method 4 TEST===1"
						  // because method4 is static and static methods are
						  // NOT overridden.
	}
	
}
