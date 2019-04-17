
public class ArrayEg 
{
	//in java arrays are classes
	
	public ArrayEg() 
	{
			//basic syntax :: type name[] = new type[numberofvalues]
			// numbering of elements starts from 0
		
			int value1[] = new int[5]; //first way to initialize values
			
			value1[0] = 34;
			value1[1] = 54;
			value1[2] = 69;
			value1[3] = 72;
			value1[4] = 12;
			
			int value2[] = {12,23,34,45,56}; //second way to initialize values
			
			//how to access : 
			
			System.out.println(value1[3]); //value1[3] = 72
			System.out.println(value2[3]); //value2[3] = 45
	}
	public static void main(String[] args) 
	{
		ArrayEg a = new ArrayEg();
	}
}
