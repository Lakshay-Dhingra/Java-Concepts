interface MyMath
{
	public int sum(int x,int y);
}

class Calc
{
	public void add(MyMath m,int a,int b)
	{
		int res=m.sum(a,b);
		System.out.println(res);
	}
}

class Demo9
{
	public static void main(String[] args)
	{
		Calc c1=new Calc();
		c1.add((x,y)->{return x*x+y*y;},2,3);
	}
}