class Demo8
{
	public static void main(String args[])
	{
		// boolean val=true;
		int age=20;
		if(age<18)
		{
			System.out.println("In Body of If");

		}
		else
		{
			System.out.println("In body of else");
		}
		
		String x=(age<18) ? ("In Body of If"):("In Body of else");
		System.out.println(x);

	}
}