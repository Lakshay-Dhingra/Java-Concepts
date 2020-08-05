//Use of Static Method With Interface

interface Shape12
{
	static int area()
	{
		System.out.println("Shape Area");
		return 0;
	}
}

class Rect12 implements Shape12
{
	public int area()
	{
		System.out.println("Rect Area");
		return 0;
	}
}

class Demo12
{
	public static void main(String[] args)
	{
		// Shape12 sobj=new Rect12();
		// sobj.area();	//	Invalid
		Shape12.area();	
	}
}