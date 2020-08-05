//using vargs
class MyMath
{
	static long sum(int ...arr)
	{
		long sum=0;
		for(int x:arr)
		{
			sum+=x;
		}
		return sum;
	}
}

class Demo8
{
	public static void main(String args[])
	{
		System.out.println(MyMath.sum()); //zero length array exists in java
		System.out.println(MyMath.sum(3,4,9));
		System.out.println(MyMath.sum(5,10));
		System.out.println(MyMath.sum(99,578));
	}
}