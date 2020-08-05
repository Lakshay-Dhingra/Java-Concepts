//2-d array 
import java.util.*;
class Demo4
{
	public static void main(String args[])
	{
		Scanner cin= new Scanner(System.in);
		int arr[][]= new int[4][3];
		System.out.println("No. of Rows: "+arr.length);
		System.out.println("No. of Columns: "+arr[0].length);
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=cin.nextInt();
			}
		}
		System.out.println("Reference var of array: "+arr);
		for(int[] row:arr)
		{
			System.out.print("Refernce var: "+row+" Length: "+row.length+" Contents: ");
			for(int col:row)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}