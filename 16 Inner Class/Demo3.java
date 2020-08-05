//local inner class

class Alpha3
{
	public void aFun()
	{
		class Beta3
		{
			void disp()
			{
				System.out.println("Local Inner Class Beta3");
			}
		}
	}
}

class Demo3
{
	Alpha3 a=new Alpha3();
	;
}