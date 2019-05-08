import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.offer("First"); //similar to add but this is queue.
		pq.offer("Second");
		pq.offer("Third");
		
		System.out.println(pq);
		
		System.out.println(pq.peek()); //returns the highest priority element
		
		pq.poll(); //removes the highest priority element
		System.out.println(pq);	
		
		pq.remove("Third"); //removes specified element if present
		System.out.println(pq);	
		
		pq.clear(); //clears all the elements from queue
		System.out.println(pq);	
	}	
}
