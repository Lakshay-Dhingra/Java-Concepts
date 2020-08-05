interface Compare
{
	public int max(int x,int y,int z);
}

class MyNumber
{
	public void highest(Compare m,int a,int b,int c)
	{
		System.out.println(m.max(a,b,c));
	}
}

class Demo10
{
	public static void main(String[] args)
	{
		MyNumber mobj=new MyNumber();
		Compare c1=(a,b,c)->{if(a>b)
								{
								if(a>c)
									return a;
								else
									return c;
								}
								else
								{
									if(b>c)
									return b;
								else
									return c;
								}
							  };
		mobj.highest(c1,22,21,34);

	}
}