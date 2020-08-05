import java.util.*;

class Rect
{
	private double length;
	private double breadth;

	public void setDetails(double l,double b)
	{
		// System.out.println("Enter Length: ");
		length=l;
		// System.out.println("Enter Breadth: ");
		breadth=b;
	}

	public void showDetails()
	{
		System.out.println("length: "+length+" breadth: "+breadth);
	}

}

class Demo3
{
	public static void main(String args[])
	{
		Rect obj1 = new Rect();
		obj1.setDetails(3,4);
		obj1.showDetails();
		Rect obj2= new Rect();
		obj2.setDetails(5,6);
		obj2.showDetails();
		Rect obj3;
		obj3=obj2;
		obj2=obj1;
		obj2.showDetails();
		obj3.showDetails();
	}
}