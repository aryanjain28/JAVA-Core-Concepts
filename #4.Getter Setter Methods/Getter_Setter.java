//As the name depicts getter is a method used to get variables,
//and setter is a method used to set variables.
//There are few drawbacks in setting variables using constructors,
//at this time these methods come handy.

class ClassName
{	
	//These are class variables.
	int id;
	
	//This is a default constructor : 
	ClassName()
	{
		id = 0;
	}
	
	//This is a getter method : 
	//Used to get variable.
	//can have return type changed according to the returning type variable.
	int getVar()
	{
		return id;
	}
	
	//this is a setter method : 
	//it sets the user input value to the variable
	//it does not return anything
	void setVar(int id)
	{
		this.id = id;
	}
	
	
	public static void main(String [] args)
	{
		//initialized class variable id to 0
		ClassName O = new ClassName();
		System.out.println("Before setting : \nID : " + O.id);
		
		//Assigning user input to id
		//let user's input be : 99
		O.setVar(99);
		//id set to 99
		
		//getting user's method
		System.out.println("\nAfter setting : ");
		System.out.println("ID : " + O.getVar());
	}
}
