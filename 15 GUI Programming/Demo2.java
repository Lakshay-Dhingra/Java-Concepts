//Frame class
import java.awt.*;
class Demo2
{
	public static void main(String[] args)
	{
		Frame fobj=new Frame("Lakshay");
		Button bobj=new Button("Ok");
		TextField tobj=new TextField(20);
		fobj.setLayout(new FlowLayout());
		fobj.add(tobj);
		fobj.add(bobj);
		fobj.setVisible(true);
		fobj.setSize(600,400);
		fobj.setLocation(600,400);
		fobj.setBackground(Color.BLUE);
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{}
		fobj.setTitle("Login");
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{}
		fobj.pack();
	}
}