
public class MulArrayEg 
{
	// multidimensional arrays are basically used for
	// rows and coloumns type elements.
	
	public MulArrayEg() 
	{
			// first [] is for rows
			// second [] is for coloumns
		
			//syntax :
			int value[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
			
			//elements {1,2,3} are in the first row
			//elements {4,5,6} are in the second row
			//elements {7,8,9} are in the third row
			
			System.out.println(value[0][2]);  //[0] == first row [2] == third element;
											// value[0][2] = 3;
	}
	public static void main(String[] args) 
	{
		MulArrayEg a = new MulArrayEg();
	}
}
