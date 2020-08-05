//Using try and catch
class Demo3
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(String s:args)
		{
			try
			{
			sum+=Integer.parseInt(s);
			}
			catch(NumberFormatException e)
			{}
		}
		System.out.println("sum = "+sum);
	}
}