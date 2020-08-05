//Using for each loop
import java.util.*;

class Demo3
{
	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int []arr= new int[cin.nextInt()];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=cin.nextInt();
		}
		
		int marks=0;
		for(int val:arr)
		{
			marks+=val;
		}
		System.out.println("Average: "+marks/arr.length);

		String str[]={"Hello","my","name","is","Lakshay"};
		for(String val:str)
		{
			System.out.print(val+" ");
		}
	}
}