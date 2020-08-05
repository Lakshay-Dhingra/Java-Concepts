//using static variable

class Alpha
{
	private static int =3;
	private int y;

	Alpha()
	{
		y=0; //avoid using static variable in constructor
	}

	void show()
	{
		System.out.println("x: "+x+" y: "+y);

	}
	void increment()
	{
		x++;
		y++;
	}
}


class Demo
{
	public static void main(String args[])
	{
		Alpha obj1 = new Alpha();
		Alpha obj2 = new Alpha();
		Alpha obj3 = new Alpha();
		obj1.increment();
		obj1.show();
		obj2.increment();
		obj2.show();
		obj3.increment();
		
		obj3.show();
	}
}