//interface inheritance
interface Shape9
{
	int area();
}

interface FillShape9 extends Shape9
{
	void fillColor();
}

class Rect9 implements FillShape9
{
	public int area()
	{
		System.out.println("Rect Area...");
		return 0;
	}

	public void fillColor()
	{
		System.out.println("Fill Rect...");
	}
}

class Demo9
{
	public static void main(String[] args)
	{
		Shape9 sobj=new Rect9();
		sobj.area();
		// sobj.fillColor();	//invalid
		FillShape9 fobj=new Rect9();
		fobj.area();
		fobj.fillColor();	
	}
}