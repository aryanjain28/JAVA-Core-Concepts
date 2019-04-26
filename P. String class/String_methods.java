public class Test
{
	/*
	 * There is a rich variety of methods in string class.
	 */
	
	public static void main(String[] args) 
	{
		//1:
		System.out.println("Github".length());
		//OUTPUT : 6
		
		//2:
		System.out.println("Github".charAt(2)); //char at index.
		//OUTPUT : t
		
		//3:
		System.out.println("Facebook".substring(4,8)); // Returns the substring from i to j-1 index.
		//OUTPUT : book
		
		//4.
		String S1 = new String("John ");
		String S2 = "Snow";
		System.out.println(S1.concat(S2));
		//OUTPUT : John Snow
		
		//5:
		int x = "Cuffy duffy duck.".indexOf("duck");
		System.out.println(x);
		// OUTPUT : 12
		
		//6.
		Boolean b = "Sugar".equals("Sugar");
		System.out.println(b);
		//OUTPUT : true
		
		//7.
		/*
		 *  int out = s1.compareTo(s2);  // where s1 and s2 are
                             			// strings to be compared

			 This returns difference s1-s2. If :
			 out < 0  // s1 comes before s2
			 out = 0  // s1 and s2 are equal.
			 out > 0   // s1 comes after s2.
		 */
		
		//8. String toLowerCase(): Converts all the characters in the String to lower case.

		//9. String toUpperCase(): Converts all the characters in the String to upper case. 

		//10.  String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
		
		
		
		
	}	
}
