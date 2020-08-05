//handle more than one exception through catch
class Demo7
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

		catch(ArithmeticException | NumberFormatException e)
		{
			System.out.println("Second Input Must Be Non Zero and Only Numbers Are Allowed.");
			e.printStackTrace();
			System.out.println(e.getMessage()); //tells the cause
			System.out.println(e.toString()); //tells exception and its cause
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You Need To Enter Atleast 2 Inputs...");
		}

		System.out.println("Visit Again...");
	}
}