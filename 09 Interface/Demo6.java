//single class multiple interface
interface Shape6
{
	int area();	//by default public
}
interface FillShape6
{
	void fillColor();
}

class Rect6 implements Shape6,FillShape6
{
	public int area()	//always use public while overriding interface methods
	{
		System.out.println("Rect Area");
		return 0;
	}
	public void fillColor()
	{
		System.out.println("Fill Color in Rect");
	}
}

class Demo6
{
	public static void main(String[] args)
	{
		Rect6 robj=new Rect6();
		robj.area();
		robj.fillColor();

		Shape6 sobj=new Rect6();
		sobj.area();
		//sobj.fillColor();	//Invalid

		FillShape6 fobj=new Rect6();
		//fobj.area();	//Invalid
		fobj.fillColor();

		Object obj=new Rect6();
		// obj.area();	//Invalid
		// obj.fillColor();	//Invalid
	}
}