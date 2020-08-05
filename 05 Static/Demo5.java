class Gamma		//Gamma=PrintStream
{
	static{
			System.out.println("In Gamma");
	}

	void show(String s)		//show()=println()
	{
		System.out.println(s);
	}
}

class Delta		//Delta=System
{
			static{
			System.out.println("In Delta");
		}
	public static final Gamma obj=new Gamma();		//obj=out
}

class Demo5
{
	static
	{
		System.out.println("In Demo5");
	}
	public static void main(String[] args)
	{
		Delta.obj.show("Hello World");
	}
	
}