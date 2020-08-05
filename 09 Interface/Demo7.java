//single class extends some other class and can also implement one or more java interface

interface Shape7
{
	int area();	//by default public
}
interface FillShape7
{
	void fillColor();
}

class RoundRect7
{
	public void fillColor()
	{
		System.out.println("Fill Color in Round Rect");
	}
}

class Rect7 extends RoundRect7 implements Shape7,FillShape7
{
	public int area()
	{
		System.out.println("Rect Area");
		return 0;
	}
	//Not necessary to make fillColor() as it is already present in parent class
}

class Demo7
{
	public static void main(String[] args)
	{
		Rect7 robj=new Rect7();
		robj.area();
		robj.fillColor();
	}
}