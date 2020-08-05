import java.util.*;
class Demo11
{
	public static void main(String args[])
	{
		int age;
		Scanner cin = new Scanner(System.in);
		int marks[]={22,33,44,55};
		
		//for each loop
		for(int val:marks)
		{
			System.out.println(val);
		}

		//for loop
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
	}
}