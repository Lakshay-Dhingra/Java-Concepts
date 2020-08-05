import java.util.*;

class Demo2
{
	public static void main(String args[])
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int arr[]= new int[cin.nextInt()];
		System.out.println("Size of array: "+arr.length);
		System.out.println("Reference of array: "+arr);
		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=cin.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
	}
}