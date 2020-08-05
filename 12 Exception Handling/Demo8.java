//Find Square of an integer given by the user
import java.util.*;
class Demo8
{
	public static void main(String[] args) 
	{
		Scanner cin=new Scanner(System.in);
		try
		{
			System.out.print("Enter a value: ");
			int inp=cin.nextInt();
			System.out.println("Sq: "+(inp*inp));
		}

		catch(InputMismatchException e)
		{
			System.out.println("Please Enter an Integer...");
		}
		finally
		{
			System.out.println("Visit Again...");
		}
	}
}