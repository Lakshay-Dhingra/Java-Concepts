//object cloning

class Rect implements Cloneable
{
	private int length,breadth;
	Rect()
	{}
	Rect(int l,int b)
	{
		length=l;breadth=b;
	}
	public void show()
	{
		System.out.println(length+" "+breadth);
	}
	public Rect clone() throws CloneNotSupportedException
	{
		return (Rect)super.clone();	//more efficient than returning object of Object class and downcasting it in main
	}
}

class Demo
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Rect r1=new Rect(12,1111);
		Rect r2=r1.clone();
		System.out.println("r1: "+r1);
		System.out.print("Details of r1: ");r1.show();
		System.out.println("r2: "+r2);
		System.out.print("Details of r2: ");r2.show();		
	}
}