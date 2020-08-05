class Rect
{
	private double length;
	private double breadth;
	private String outlinecolor;
	Rect() //Default constructor
	{
		System.out.println("Default Constructor Called");
		length=2;
		breadth=5;
		outlinecolor="Red";
	}

	Rect(int x,int y,String z) //Parameterized Constructor
	{
		System.out.println("Parameterized Constructor Called");
		length=x;
		breadth=y;
		outlinecolor=z;
	}
	void show()
	{
		System.out.println(length+" "+breadth+" "+outlinecolor);
	}
	// void setdetails()
}

class Demo
{
	public static void main(String args[])
	{
		Rect obj1=new Rect();
		obj1.show();
		Rect obj2=new Rect(3,8,"Blue");
		obj2.show();
	}
}