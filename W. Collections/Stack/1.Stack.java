import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		//stack comes under list collection
		
		Stack<String> s = new Stack<String>();
		s.push("Bottom");
		s.push("Middle");
		s.push("Top");
		
		printStack(s);
		printStack(s);
		printStack(s);
		printStack(s);
		
	}

	private static void printStack(Stack<String> S) 
	{
		if(!S.isEmpty()) System.out.println(S.pop());
		else System.out.println("****STACK EMPTY!!****");
	}
}
