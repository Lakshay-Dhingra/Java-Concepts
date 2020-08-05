//same method in both interface

interface Shape
{
	int area();	//by default public
}
interface FillShape
{
	int area();	//by default public
}

class Rect implements Shape,FillShape
{
	public int area()	//We need to define area() just once
	{
		System.out.println("Rect Area");
		return 0;
	}
}

class Demo8
{
	public static void main(String[] args) {
		Shape sobj=new Rect();
		sobj.area();
		FillShape fobj=new Rect();
		fobj.area();
	}
}