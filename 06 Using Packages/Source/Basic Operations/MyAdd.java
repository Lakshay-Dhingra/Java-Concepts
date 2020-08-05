package Mymath;
class MyAdd
{
	private int x;
	private int y;
	private int sum;
	MyAdd()
	{}
	MyAdd(int x,int y)
	{
		this.x=x;
		this.y=y;
		sum=x+y;
	}
	public void printXY()
	{
		System.out.println("x: "+x+" y: "+y);
	}
	public String toString()
	{
		return sum+" ";
	}
	public int getSum()
	{
		return sum;
	}
}