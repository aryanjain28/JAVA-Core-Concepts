public class ObjectArray 
{
	// we can create an array of objects for a class
	// syntax will be same as that of normal array
	// but type will be classname
	
	public void method()
	{
		System.out.println("Random method!");
	}
	
	public static void main(String[] args) 
	{
		//type == classname
		ObjectArray a[] = new ObjectArray[10]; //an array of 10 objects of class ObjectArray
		
		//initialization of 1st object :
		a[0] = new ObjectArray();
		a[0].method(); // method for a[0] object
		
		//initialization of 2nd object :
		a[1] = new ObjectArray();
		a[1].method();	 // method for a[1] object
		
		//initialization of 3rd object :
		a[2] = new ObjectArray();
		a[2].method(); // method for a[2] object
	}
}
