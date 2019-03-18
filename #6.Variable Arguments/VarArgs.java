//Varags aka Variable arguments is one of the most unique
//feature in java programming language.

//Basically it provides a way for the programmer to create a
//function that is not restricted to the NUMBER OF ARGUMENTS
//passed by the user.

//We will understand the concept with a sum function.

class ClassName
{	
	
	//NOTE : syntax of varargs : ...
	//The compiler understands that any number of arguments can be passed.
	
	int add(int ... a)
	{
		int sum = 0;
		
		//This is a special loop called FOR-EACH loop in java.
		for(int x:a)
		{
			sum = sum + x;
		}
		return sum;
	}
	
	void add(String X, int ... a)
	{
		int sum = 0;
		
		//This is a special loop called FOR-EACH loop in java.
		for(int x:a)
		{
			sum = sum + x;
		}
		System.out.println(X + " is " + sum);
	}
	
	static public void main(String [] args)
	{
		ClassName O = new ClassName();
		
		//calling with 7 number of arguments:
		int SUM1 = O.add(1,2,3,4,5,6,7);		
		System.out.println("Sum 1 : " + SUM1);
		
		//calling with 4 number of arguments:
		int SUM2 = O.add(1,12,3,54);
		System.out.println("Sum 2 : " + SUM2);
		
		//Can pass other variables too along with varargs
		O.add("Sum", 12,23,34);
		//NOTE : Always keep varargs right most side of argument list.
		//(int ... a, int b, int c) == NOT ALLOWED.
	}
	
	//Limitation :
	//a. Cannot have multiple varargs in a function == (int ...a, double ...d) == NOT ALLOWED.
}
