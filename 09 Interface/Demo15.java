//

interface Alpha
{
	default void show()
	{
		System.out.println("Alpha interface");
	}
}

interface Beta extends Alpha
{
	default void show()	//overriding parent default interface method
	{
		System.out.println("Beta interface");
	}
}

class Gamma implements Beta
{

}

interface Demo15
{
	public static void main(String[] args)
	{
		Gamma obj=new Gamma();
		obj.show();
		Alpha aobj=new Gamma();
		aobj.show();
		Beta bobj=new Gamma();
		bobj.show();
	}
}
