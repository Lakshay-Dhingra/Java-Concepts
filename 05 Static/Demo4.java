//use of final with static
class Beta
{
	public static final int y=10;
	static
	{
		// y=20;
	}
}

class Demo4
{
	
	public static final int y;
	static
	{
		y=20;
	}
	public static void main(String[] args) 
	{
			System.out.println("In Demo4 y = "+y);
			Beta obj=new Beta();
			System.out.println("In Beta y = "+Beta.y);
	}
}