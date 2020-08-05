class Papa extends Thread
{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Papa taking cofee.. "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{}
		}
	}
}
class Son extends Thread
{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Son taking milk.. "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{}
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Papa pobj=new Papa();
		Son sobj=new Son();
		pobj.start();	sobj.start();
	}
}
