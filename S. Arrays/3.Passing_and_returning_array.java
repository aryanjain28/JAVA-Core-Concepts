public class Solution
{
	//passing values.
	//returning an array with array method.
	
	public static void main(String[] args) 
	{
		int e[] = {1,2,3,4,5};
		System.out.println(sum(e)+"\n");
		
		for(int i=0; i<arr().length; i++)
			System.out.println(arr()[i]);
	}
		
	static int sum(int a[])
	{
		int sum=0;
		
		for(int i=0; i<a.length; i++)
			sum += a[i];
		
		return sum;
	}
	
	static int [] arr()
	{
		int a[] = {1,2,3,4,5};
		return a;
	}
}
