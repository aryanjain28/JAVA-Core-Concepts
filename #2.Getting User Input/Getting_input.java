import java.util.*;

class ClassName
{	
	public static void main(String [] args)
	{
		//Scanner is a class imported from util package & it is used to take input from user.
		//Here we make an object of Scanner class.
		//*System.in* is basically used to tell that take INPUT from system device i.e. keyboard!
		
		Scanner in = new Scanner(System.in);
		
		// here --in-- is an object of class Scanner
		
		String S1;
		S1 = in.next();
		//in.next() is a method inside Scanner class used for taking String input without spaces.
		
		String S2;
		S2 = in.nextLine();
		//in.next() is a method inside Scanner class used for taking String input with spaces.
		
		int I;
		I = in.nextInt();
		//in.next() is a method inside Scanner class used for taking int input.
		
		float f;
		f = in.nextFloat();
		//in.next() is a method inside Scanner class used for taking float input.
		
		double d;
		d = in.nextDouble();
		//in.next() is a method inside Scanner class used for taking double input.
		
		in.close();
		//it is always a better practice to close your opened Scanner object
	}
}
