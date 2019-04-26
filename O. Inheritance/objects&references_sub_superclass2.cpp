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
		//Reference of SUPER :: OBJECT of SUB
		Test1 O1 = new Test2();
		O1.method1();

		//		O1.method2(); this will give error.
		
		/*
		 * Now we know that by using reference ‘mb2’ 
		 * of type Bicycle, we are unable to call subclass specific methods 
		 * or access subclass fields. This problem can be solved using 
		 * type casting in java.
		 */
		
		Test2 O2;
		O2 = (Test2)O1;
		
		O2.method2(); //VALID
	}
}
