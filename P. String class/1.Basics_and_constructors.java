import java.io.UnsupportedEncodingException;

public class Test
{
	/*
	 * In JAVA, string are classes and objects of string class
	 * are immutable i.e. they cannot be changed after creation.
	 */
	
	public static void main(String[] args) 
	{
		// There are two ways to initialize a string.
		String s1 = "String one.";
		String s2 = new String("String two");
		
		//Important constructors of string class : 
		
		/* 1. String(byte[] byte_arr) – Construct a new String by decoding the byte array. 
		 * It uses the platform’s DEFAULT CHARACTER set for decoding.
		 */
		
		byte[] arr = {71, 105, 116, 104, 117, 98}; //refer a ascii table
		String S1 = new String(arr);
		System.out.println(S1);
		
		/*
		 * 2. String(byte[] byte_arr, int start_index, int length) – 
		 * Construct a new string from the bytes array depending 
		 * on the start_index(Starting location) and 
		 * length(number of characters from starting location).
		 */
		String S2 = new String(arr, 0, 3);
		System.out.println(S2);
		
		/*
		 * 3. String(byte[] byte_arr, String char_set_name) – 
		 * Construct a new String by decoding the byte array. 
		 * It uses the char_set_name for decoding.
		 */
		
		String S3 = null;
		try 
		{
			S3 = new String(arr, "US-ASCII");
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}
		System.out.println(S3);
		/*
		 * There are many more constructors.
		 */
		
		
	}
}
