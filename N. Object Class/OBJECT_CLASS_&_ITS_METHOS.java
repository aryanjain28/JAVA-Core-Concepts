/*
 *  Object class is present in java.lang package. 
 *  Every class in Java is directly or indirectly derived from the Object class. 
 *  If a Class does not extend any other class then it is direct child class of Object
 *  and if extends other class then it is an indirectly derived. 
 *  Therefore the Object class methods are available to all Java classes. 
 *  Hence Object class acts as a root of inheritance hierarchy in any Java Program.
*/

// METHOS IN OBJECT CLASS : 

public class Test
{
	//#1.toString()  ....discussed earlier
	
	//#2. hashCode()
	/*	It converts internal address of object to an integer value 
	 *  and returns it. 
	 *  We can check same object conditions using this.
	 */
	void method1()
	{
		String s1 = new String(); //String uses a string-pool concept
		String s2 = new String(); //and therefore its output will be SAME.
		
		if(s1.hashCode() == s2.hashCode())
			System.out.println("SAME");
	}
	
	
	
	/* #3. getClass()
	 *  Returns the class object of “this”
	 *  object and used to get actual runtime 
	 *  class of the object.
	 */
	void method2()
	{
		Object o = new String("Github");
		Class c = o.getClass();
		System.out.println("Name of class : " + c.getName());
	}
	
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.method1();
		t1.method2();
	}
}
