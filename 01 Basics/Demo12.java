import java.util.*;
class Demo12
{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter age");
		int age=cin.nextInt();
		

		outer: // scope name
		{

			if(age<10)
				break outer;
			System.out.println("Welcome To Shopping  Mall");
			inner:
			{
				System.out.println("Enter Purchased Amount");
				int money =cin.nextInt();
				if(money<100)
					break outer;
				else if(money>100 && money<=4000)
				{
					System.out.println("Avg shopping");
					break inner;
				}
				System.out.println("Luxury shopping");
			}

			System.out.println("Thanks For Visit");
		}
	}
}