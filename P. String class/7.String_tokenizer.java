import java.util.StringTokenizer;

public class Test
{
	// StringTokenizer class in Java is used to break a string into tokens. 
	public static void main(String[] args) 
	{
			String S = new String("This is digital world.");
			
			//CONSTRUCTORS : 
			//1.StringTokenizer(String str) :
			StringTokenizer ST = new StringTokenizer(S);
				while(ST.hasMoreTokens())
					System.out.println(ST.nextToken());
				
			//2.StringTokenizer(String str, String delimiter) :
			StringTokenizer ST1 = new StringTokenizer(S, " ");
				while(ST1.hasMoreTokens())
					System.out.println(ST1.nextToken());
				
			//3.StringTokenizer(String str, String delim, boolean flag):
			StringTokenizer ST2 = new StringTokenizer(S, " ", true);
				while(ST2.hasMoreTokens())
					System.out.println(ST2.nextToken());
				//" " <--- included as token.
			
			StringTokenizer ST3 = new StringTokenizer(S, " ", false);
			while(ST3.hasMoreTokens())
				System.out.println(ST3.nextToken());
			//" " <--- not included as token.
	}		
}
