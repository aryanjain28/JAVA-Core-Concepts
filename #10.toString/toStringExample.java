
public class Birthdate 
{	
	private int date;
	private int month;
	private int year;
	
	public Birthdate(int d, int m, int y) 
	{
		// this is a keyword used for CURRENT OBJECT.
		// this.something == CURRENTOBJECT.something;
		
		this.date = d;
		this.month = m;
		this.year = y;
	}
	
	public static void main(String[] args) 
	{
		Birthdate BirthdateObject = new Birthdate(28, 12, 1997);
		System.out.println(BirthdateObject); // string representation of object.
											// here it will check for toString method.
	}
	
	public String toString()
	{
		return String.format("My birthday is on : %d/%d/%d.", date, month, year);
	}
}
