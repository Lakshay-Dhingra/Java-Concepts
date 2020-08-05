//2-d array with varying columns
import java.util.*;
class Demo5
{
	public static void main(String args[])
	{
		Scanner cin= new Scanner(System.in);
		int arr[][]= new int[3][3];
		System.out.println("No. of Rows: "+arr.length);
		System.out.println("No. of Columns will vary for each row");
		arr[1]=new int[5];
		arr[2]=new int[2];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Length of column: "+arr[i].length+" Enter Elements: ");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=cin.nextInt();
			}
		}
		System.out.println("Array:");
		for(int[] row:arr)
		{
			for(int col:row)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}