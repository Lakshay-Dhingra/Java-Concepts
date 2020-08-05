package Mymath;
class MyMul
{
	private int x;
	private int y;
	private int prod;
	MyMul()
	{}
	MyMul(int x,int y)
	{
		this.x=x;
		this.y=y;
		prod=x*y;
	}
	public void printXY()
	{
		System.out.println("x: "+x+" y: "+y);
	}
	public String toString()
	{
		return prod+" ";
	}
	public int getProd()
	{
		return prod;
	}
}