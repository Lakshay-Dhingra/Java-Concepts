//rethrowing an exception
class Demo14
{
	public static void main(String[] args)
	{
		System.out.println("In main()...");
		try
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[0]);
			int res=x/y;
			System.out.println("res: "+res);

		}
		catch(ArithmeticException e)
		{
			System.out.println("Second Input must be non zero!");
			throw e; //rethrow
		}
		System.out.println("Out of main()...");
	}
}

//ability of handling an already handled exception is known as rethrowing exception,

//to rethrow there is no seperate keyword, we can do it by using "throw" statement

//to rethrow exception.... we need help of catch block or in some outer try catch if any. 
