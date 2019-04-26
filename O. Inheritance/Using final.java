/*
 * final is a keyword in java used for restricting some functionalities. 
 * We can declare variables, methods and classes with final keyword.
*/

/*
 * A final method cannot be overridden therefore,
 *  
 * We can declare final method in any subclass for which
 * we want that if any other class extends this subclass, 
 * then it must follow same implementation of the method 
 * as in the that subclass.
 */

//this will act as PARENT class.
abstract class Test1
{
	private String name;
	
	public final void setName(String name)
	{
		this.name = name;
	}
	
	public final String getName()
	{
		return this.name;
	}
}

class Test2 extends Test1
{
	void method()
	{
		// here we cannot override getter and setter methods.
		// we have to use them as they are.
		// This is the reason to use final with methods;
		
		Test2 O = new Test2();
		O.setName("John");
		System.out.println(O.getName());
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		Test2 O2 = new Test2();
		O2.method();
	}
}
