interface Alpha
{
	default void show()
	{
		System.out.println("Alpha interface");
	}
}

class Beta implements Alpha
{
	public void show()
	{
		System.out.println("Beta interface");
	}
}

interface Demo13
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		Alpha obj=new Beta();
		obj.show();
	}
}
