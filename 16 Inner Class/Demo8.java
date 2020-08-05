//using lambda to shorten Demo 7 Code


interface MyMath
{
	public int sum(int x,int y);
}

class Demo8
{
	public static void main(String[] args)
	{
		MyMath m1= (x,y) -> {System.out.print("m1 sum: ");	return x+y;};

		int res=m1.sum(4,6);
		System.out.println(res);

		MyMath m2= (x,y) -> {System.out.print("m2 sum: ");	return x*x+y*y;};

		res=m2.sum(4,6);
		System.out.println(res);

	}
}