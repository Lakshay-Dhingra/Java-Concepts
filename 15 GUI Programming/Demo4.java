//TextArea class

import java.awt.*;
class Demo4
{
	public static void main(String[] args)
	{
		Frame f=new Frame("Login");
		TextArea ta=new TextArea(2,20);
		TextField tf=new TextField(20);
		f.setLayout(new FlowLayout());
		ta.setFont(new Font("courier",Font.ITALIC|Font.BOLD,18));
		ta.setForeground(Color.YELLOW);
		ta.setBackground(Color.BLUE);
		ta.setText("Username:");
		f.add(ta);
		f.add(tf);
		f.setSize(400,300);
		f.setVisible(true);
		try
		{
			Thread.sleep(8000);
		}
		catch(Exception e)
		{}
		System.out.println(ta.getText());
		ta.setEditable(false);
		// t3.setEnabled(false);
	}
}