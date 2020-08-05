//this reference variable

import java.util.*;

class Rect
{
	private double length;
	private double breadth;

	public void setDetails(double length,double breadth)
	{
		System.out.println("this = "+this);
		this.length=length;
		this.breadth=breadth;
	}

	public void showDetails()
	{
		int length=234;
		int breadth=345;
		System.out.println("length: "+length+" breadth: "+breadth);
		System.out.println("length: "+this.length+" breadth: "+this.breadth);
	}

}

class Demo4
{
	public static void main(String args[])
	{
		Rect obj = new Rect();
		obj.setDetails(3,4);
		System.out.println("object = "+obj);
		obj.showDetails();
		
	}
}