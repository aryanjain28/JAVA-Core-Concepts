public class Test
{
	public Test()
	{
			String S1 = new String("One");
			String S2 = new String("Two");
			
			System.out.println("Before : ");
			System.out.println("S1 = " + S1 + "| S2 = " + S2);
			
			
			S1 = S1.concat(S2);
			S2 = S1.substring(0, (S1.length()-S2.length()));
			S1 = S1.substring((S1.length()-S2.length()));
			
			System.out.println("\nAfter : ");
			System.out.println("S1 = " + S1 + "| S2 = " + S2);
	}
	
	public static void main(String[] args) 
	{
		Test o = new Test();
	}
}
