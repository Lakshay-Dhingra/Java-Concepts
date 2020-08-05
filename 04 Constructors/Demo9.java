//Constructor Chaining
class Rect9
{
	private double length;
	private double breadth;
	Rect9()
	{
		this(0);			//this must be the first statement of constructor
		System.out.println("Zero Parameter constructor called.");
	}
	Rect9(int x)
	{
		this(x,x);
		System.out.println("One Parameter constructor called.");
	}
	Rect9(int x,int y)
	{
		System.out.println("Two Parameter constructor called.");
		length=x;
		breadth=y;
	}
	void show()
	{
		System.out.println("Length: "+length+" Breadth: "+breadth);
	}
}

class Demo9
{
	public static void main(String args[])
	{
		Rect9 obj1=new Rect9();
		obj1.show();
		Rect9 obj2=new Rect9(3);
		obj2.show();
		Rect9 obj3=new Rect9(5,9);
		obj3.show();
	}
}