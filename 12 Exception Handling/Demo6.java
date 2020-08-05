//Using parent exception handler
class Demo6
{
	public static void main(String[] args) 
	{
		try
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			float res=(x/y);
			System.out.println("Division = "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second Input Must Be Non Zero!");
			// e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Some Exception Ocurred...");
			// e.printStackTrace();
		}
		System.out.println("Visit Again...");
	}
}