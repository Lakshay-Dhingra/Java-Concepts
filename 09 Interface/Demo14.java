interface Alpha
{
	default void show()
	{
		System.out.println("Alpha interface");
	}
}

interface Beta
{
	default void show()
	{
		System.out.println("Beta interface");
	}
}

class Gamma implements Alpha,Beta
{
	//If we dont override then it will give error because we got 2 copies of same func
	public void show()
	{
		System.out.println("Gamma interface");
	}
}

interface Demo14
{
	public static void main(String[] args)
	{
		// System.out.println("Hello World");
		Gamma obj=new Gamma();
		obj.show();
		Alpha aobj=new Gamma();
		aobj.show();
		Beta bobj=new Gamma();
		bobj.show();
	}
}
