import java.util.*;

class Rect
{
	private double length;
	private double breadth;

	public void getDetails()
	{
	Scanner cin= new Scanner(System.in);
	System.out.println("Enter Length:");
	length= cin.nextDouble();
	System.out.println("Enter Breadth:");
	breadth= cin.nextDouble();
	}

	public void showDetails()
	{
		System.out.println("length: "+length+" breadth: "+breadth);
	}

	public double area()
	{
		return (length*breadth);
	}
}

class Demo2
{
	public static void main(String args[])
	{
		Rect obj = new Rect();
		obj.getDetails();
		obj.showDetails();
		System.out.println(obj.area());
	}
}