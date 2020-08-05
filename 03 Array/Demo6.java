//Array without using new keyword
class Demo6
{
	public static void main(String args[])
	{
		int arr[][]={
			{11,22,33,44},{33,55},{44,55,88},{22,99}
		};
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