//Class.forName(String classname)
class Alpha
{
	static {System.out.println("Alpha Loading...");}
}
class Beta
{
	static {System.out.println("Beta Loading...");}
}
class Demo
{
	public static void main(String[] args)
	{
		try{
			Class.forName(args[0]);
			System.out.println("Class Loaded");
			}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}