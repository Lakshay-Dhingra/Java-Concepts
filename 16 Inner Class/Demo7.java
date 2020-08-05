interface MyMath
{
	public int sum(int x,int y);
}

class Demo7
{
	public static void main(String[] args)
	{
		MyMath m1=new MyMath()
		{
			public int sum(int x,int y)
			{
				return x+y;
			}
		};

int res=m1.sum(4,6);
System.out.println(res);
		MyMath m2=new MyMath()
		{
			public int sum(int x,int y)
			{
				return (x*x)+(y*y);
			}
		};

res=m2.sum(4,6);
System.out.println(res);

	}
}