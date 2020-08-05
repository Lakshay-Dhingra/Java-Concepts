interface Shape5
{
	int area();	//by default public abstarct
}

class Rect5 implements Shape5
{
	public int area()
	{
		System.out.println("Rect Area");
		return 0;
	}
}

class Tri5 implements Shape5
{
	public int area()
	{
		System.out.println("Tri Area");
		return 0;
	}
}

class Demo5
{
	public static void main(String[] args)
	{
		Shape5 sobj=new Rect5();	//Upcasting
		sobj.area();
		Shape5 sobj2=new Tri5();	//Upcasting
		sobj2.area();	
	}
}