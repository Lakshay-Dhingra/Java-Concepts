class Parent
{
	static
	{
		System.out.println("Parent Loading...");
	}

	Parent()
	{System.out.println("Parent Constructor....");}
}

class Child extends Parent
{
	static
	{
		System.out.println("Child Loading...");
	}

	Child()
	{System.out.println("Child Constructor...");}
}

class Demo
{
	public static void main(String[] args) 
	{
		Child cobj=new Child();	
	}
}