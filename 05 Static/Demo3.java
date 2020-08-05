class Alpha3
{
	public static int y;
	static
	{
		System.out.println("In Alpha3...");
		System.out.println("y = "+y);
		y=400;
	}
	void show()
	{
		System.out.println("y = "+y);
	}
	static
	{
		y=y+10;
	}
}

class Demo3
{
	public static void main(String[] args)
	{
		System.out.println("In Demo3...");
		Alpha3 obj=new Alpha3();
		obj.show();
		Alpha3.y=890;
		System.out.println("y = "+obj.y);
	}
}
