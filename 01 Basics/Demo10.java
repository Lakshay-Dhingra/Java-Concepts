import java.util.*;
class Demo10
{
	public static void main(String args[])
	{
		int age;
		Scanner cin = new Scanner(System.in);
		
		//do while loop
		do
		{
			System.out.println("Enter Age");
			age=cin.nextInt();
		}while(age<0);
		System.out.println("Age is: "+age);
		
		System.out.println();

		//while loop
		int x=1;
		while(x<10)
		{
			System.out.println(x);
			x++;
		}
		System.out.println();

		//for loop
		for(int i=1;i<=5;i++)
		{
			System.out.println("i= "+i);
		}
		System.out.println();
		
		//infinite for loop
		for(int i=1;;i++)
		{
			System.out.println("i= "+i);
			if(i==7)
				break;
		}
		System.out.println();
		
		//for loop with multiple statements
		for(int i=1,j=5;;i++,j++)
		{
			System.out.println("i= "+i+" j= "+j);
			if(i==7)
				break;
		}
		System.out.println();

		//Nested For Loop
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println("i= "+i+" j= "+j);
			}
					System.out.println();
		}
	}
}