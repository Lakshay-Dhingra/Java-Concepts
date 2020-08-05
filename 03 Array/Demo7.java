//passing array to method- print,avg
class MyMath
{
	static double avg(int x[])
	{
		long sum=0;
		for(int y:x)
		{
			sum+=y;
		}
		return ((double)sum)/((double)(x.length));
	}

	static void printArr(int x[])
	{
		System.out.println("Array:");
		for(int row:x)
		{
			System.out.print(row+" ");
		}
		System.out.println();
	}
}



class Demo7
{
	public static void main(String args[])
	{
		int arr1[]={11,22,33,44};
		int arr2[]={13,22,39};
		int arr3[]={11,22,33,55,88,4,0,99};

		MyMath.printArr(arr1);
		System.out.println("Average: "+MyMath.avg(arr1));
		System.out.println();
		
		MyMath.printArr(arr2);
		System.out.println("Average: "+MyMath.avg(arr2));
		System.out.println();
		
		MyMath.printArr(arr3);
		System.out.println("Average: "+MyMath.avg(arr3));
	}
}