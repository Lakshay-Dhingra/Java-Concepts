//User Defined Exception
class MyException extends Exception
{
	MyException()
	{
		super();
	}
	MyException(String str)
	{
		super(str);
	}
}

class Demo13
{
	public static void main(String[] args)
	{
		System.out.println("In main()...");
		try
		{
			throw new MyException("Some Problem Occured!");
		}
		catch(MyException e)
		{
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Out of main()...");
	}
}