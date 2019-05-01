public class Solution
{
	int x, y;
	
	//creating copy of an object using assignment operator.
	//When we use = sign, the objects points towards the same location therefore
	//any change in the members of object1 will make changes to object2 also.
	
	// That is why this cannot be called a pure copy of an object.
	
	Solution(int A, int B)
	{
		this.x = A;
		this.y = B;
	}
	
	public static void main(String[] args) 
	{
		Solution Obj1 = new Solution(200, 100);
		System.out.println("Using object1 :: X : " + Obj1.x + " Y : " + Obj1.y);
		Solution Obj2 = Obj1;
		System.out.println("Using object2 :: X : " + Obj2.x + " Y : " + Obj2.y);
		//making changes in object1
		Obj1.x = 300;
		Obj1.y = 400;
		System.out.println("After changes in Object1 :: X : " + Obj1.x + " Y : " + Obj1.y);
		System.out.println("After chnages in Object2 :: X : " + Obj1.x + " Y : " + Obj1.y);
	}
}
