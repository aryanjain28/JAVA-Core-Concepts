//If derived class static method & base class static method have
// same name. Then derived class static method shadows base class static method.
//This is called SHADOWING.

public class Test
{
	public static void main(String[] args) 
	{
		Two o = new One();
		o.method();
		//will print :: Two
	}
}

class One extends Two
{
	static void method()
	{
		System.out.println("One");
	}
}

class Two
{
	static  void method()
	{
		System.out.println("Two");
	}
}
