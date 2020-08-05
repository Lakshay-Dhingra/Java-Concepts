import java.util.*;

class Alpha2
{
	int sum(int x,int y)//non static
	{
		System.out.println("Sum is:");
			return (x+y);
	}

	static int sq(int x) //static method
	{
		System.out.println("Square is:");
		return (x*x);
	}
}

class Demo13
{
	public static void main(String args[])
	{
		// Scanner cin = new Scanner(System.in);
		// System.out.println("Enter age");
		// int age=cin.nextInt();
		int res = Alpha2.sq(6);
		System.out.println("Res = "+res);

		Alpha2 obj = new Alpha2();
		res = obj.sum(23,45);
		System.out.println("Res = "+res);
		
	}
}