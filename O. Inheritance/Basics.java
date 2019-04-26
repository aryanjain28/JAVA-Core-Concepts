//Parent class
class SuperClass
{
	public int x;
	protected int y;
	private int z;
	
	public SuperClass() 
	{
		System.out.println("Super Class comstructor.!");
	}
	
	public void Method1(int x) 
	{
		System.out.println("Public method 1." + "\nPublic X : " + x);
	}
	protected void Method2(int y) 
	{	
		System.out.println("Public method 2." + "\nPublic Y : " + y);
	}
	void setter(int z)
	{
		this.z = z;
	}
	int getter()
	{
		return z;
	}
}


//Child class :: can acces all public
//and protected members of parent class.

//##We can access private members also using
//getter setter methods.

public class SubClass extends SuperClass  // SYNTAX
{
	public static void main(String[] args) 
	{
		//constructor of super class is 
		//automatically called always on object creation.
		SubClass O = new SubClass();
		
		//accessing public member
		O.x = 10;
		O.Method1(O.x);
		
		//accessing protected member
		O.y = 20;
		O.Method1(O.y);
		
		//accessing private member
		O.setter(12);
		System.out.println(O.getter());
	}
	
	//There is no multiple inheritance in java.
	//Though we can access it using INTERFACES.
	
	//Types of Inheritance in JAVA: 

	//1. Single level;
	//2. Multilevel;
	//3. Hierarchical 
	//4. Multiple (through interfaces)
	//5. Hybrid (through interfaces)
}
