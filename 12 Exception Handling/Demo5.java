//Using finally
class Demo5
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
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You Need To Enter Atleast 2 Inputs...");
		}
		finally
		{
		System.out.println("Visit Again...");
		}
	}
}