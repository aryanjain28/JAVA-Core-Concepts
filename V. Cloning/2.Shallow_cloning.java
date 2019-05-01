/*
 * #1.Shallow copy of an object using built in clone() method 
 * creates exact copy on object.
 * #2.Changing primitive data types will not change the contents of
 * copied object.
 * #3.Changing reference in one object will change the contents in both objects.
 */

class DOB
{
	int date;
	int month;
	int year;
	
	DOB(int date, int month, int year)
	{
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public String toString()
	{
		return date+"/"+month+"/"+year;
	}
}

class Person implements Cloneable
{
	String name;
	int age;
	DOB Obj;
	
	public Person(String name,  int age, DOB O)
	{
		this.name = name;
		this.age = age;
		this.Obj = O;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class Solution
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		DOB O = new DOB(28, 12, 1997);
		Person P1 = new Person("John", 21, O);
		Person P2 = null;
		
		System.out.println("Name : " + P1.name);
		System.out.println("Age : " + P1.age);
		System.out.println("Dob : " + P1.Obj);
		
		P2 = (Person)P1.clone();
		
		//Primitive data types :: will not change (shallow cloning)
		P2.name = "Bruce";
		P2.age = 51;
		//Reference will change.
		P2.Obj.date = 14;
		P2.Obj.month = 6;
		P2.Obj.year = 1964;
		
		
		System.out.println("\n\nName : " + P1.name);
		System.out.println("Age : " + P1.age);
		System.out.println("Dob : " + P1.Obj);
	}
	
	
}

/*
 * OUTPUT ::
 * 
Name : John
Age : 21
Dob : 28/12/1997


Name : John
Age : 21
Dob : 14/6/1964

*/
