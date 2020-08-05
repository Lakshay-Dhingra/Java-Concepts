import java.awt.*;

class Demo
{
	public static void main(String[] args)
	{
		Frame f=new Frame("Login");
		f.setSize(300,300);
		f.setLocation(400,400);
		f.setBackground(Color.GREEN);
		f.setVisible(true);
		try
		{
			Thread.sleep(7000);
		}
		catch(InterruptedException e)
		{}
		f.setResizable(false);
		try
		{
			Thread.sleep(7000);
		}
		catch(InterruptedException e)
		{}
		f.dispose();
	}
}