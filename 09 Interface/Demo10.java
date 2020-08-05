//interface type in function arguments

interface Shape
{
	void rotation();	//by default public
}

class Rect implements Shape
{
	public void rotation()
	{
		System.out.println("Rect Rotation");
	}
}

class Tri implements Shape
{
	public void rotation()
	{
		System.out.println("Tri Rotation");
	}
}
class SomeGame
{
	public void selectShape(Shape sobj)
	{
		sobj.rotation();
	}
}
class Demo10
{
	public static void main(String[] args)
	{
		SomeGame gobj=new SomeGame();
		gobj.selectShape(new Rect());
		gobj.selectShape(new Tri());
	}
}