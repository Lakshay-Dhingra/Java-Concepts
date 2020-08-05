import java.util.*;
class Demo9
{
	public static void main(String args[])
	{
		String day;
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter The Day:");
		day=cin.nextLine();
		switch(day)
		{
			case "mon":
			case "tue":
			case "wed":
			case "thu":
			case "fri":
			System.out.println("Working Day");
			break;
			case "sat":
			case "sun":
			System.out.println("Weekend");
			break;
			default:
			System.out.println("Invalid Day");
		}

	}
}