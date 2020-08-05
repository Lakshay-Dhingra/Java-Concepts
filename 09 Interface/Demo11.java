//interface as return type of a method

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

class Game
{
	public static Shape getShape(int choice)
	{
		if(choice==1)
		{
			return new Rect();
		}
		if(choice==2)
		{
			return new Tri();
		}
		return null;
	}
}
class Demo11
{
	public static void main(String[] args)
	{
		int choice =0;
		java.util.Scanner cin=new java.util.Scanner(System.in);
		System.out.print("Enter Your Choice: 1.Rect 2.Tri : ");
		choice=cin.nextInt();
		Shape sobj=Game.getShape(choice);
		sobj.rotation();
	}
}