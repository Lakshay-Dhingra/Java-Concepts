class Alpha2
{
	private static int x;
	private  int y;
	
	static
	{
		System.out.println("Alpha Loading....");
		java.util.Scanner cin=new java.util.Scanner(System.in);
		System.out.println("Enter Initial Value for x: ");
		x=cin.nextInt();
	}

	public Alpha2()
	{
		y=0;
	}

	public void show()
	{
		System.out.println("x: "+x+" y: "+y);

	}
	public void increment()
	{
		x++;
		y++;
	}
}


class Demo2
{
	public static void main(String args[])
	{
		System.out.println("Demo Loading....");
		Alpha2 obj1 = new Alpha2();
		Alpha2 obj2 = new Alpha2();
		Alpha2 obj3 = new Alpha2();
		obj1.increment();
		obj1.show();
		obj2.increment();
		obj2.show();
		obj3.increment();
		obj3.show();
	}
}