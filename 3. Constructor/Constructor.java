//Constructors are basically used for initialization of class variables.
//But they are very useful in other applications of java too.
//A construct is a method with : 
//			1. No return type.
//			2. Same name as that of a class.

class ClassName
{	
	//These are class variables.
	int a, b;

	//1.Name of construct should be same as that of ClassName
	//2.Remember NO RETURN TYPE!
	//3.Constructors can be overloaded too.
	//4.In JAVA there are 2 types of constructors : 
	//		a. Default.
	//		b. Parameterized.
	
	//This is a default constructor : 
	ClassName()
	{
		a = 10;
		b = 20;
	}
	
	//This is a parameterized constructor :
	ClassName(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	
	public static void main(String [] args)
	{
		//made object of default constructor
		ClassName O1 = new ClassName();
		System.out.println(O1.a + "---" + O1.b);
	
		//made object of parameterized constructor
		ClassName O2 = new ClassName(88, 99);
		System.out.println(O2.a + "---" + O2.b);
	}
}
