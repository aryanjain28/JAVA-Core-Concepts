/*
 * StringBuffer is a peer class of String that provides 
 * much of the functionality of strings. 
 * String represents fixed-length, immutable character sequences while 
 * StringBuffer represents growable and writable character sequences.
 */

public class Test
{
	public static void main(String[] args) 
	{
		//constructors : 
		
		StringBuffer S = new StringBuffer(); 
		//reserves room for 16 characters without reallocation.
		
		StringBuffer S1 = new StringBuffer(20);
		//It accepts an integer argument that explicitly sets the size of the buffer.
		
		StringBuffer S2 = new StringBuffer("Why and how?");
		//It accepts a String argument that sets the initial 
		//contents of the StringBuffer object and reserves room 
		//for 16 more characters without reallocation.
	}
}
