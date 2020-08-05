//TextField class

import java.awt.*;
class Demo3
{
	public static void main(String[] args) {
		

		Frame f=new Frame("Login");
		TextField t=new TextField("Hello",20);
		TextField t2=new TextField(20);
		TextField t3=new TextField(20);
		f.setLayout(new FlowLayout());
		t.setFont(new Font("courier",Font.ITALIC|Font.BOLD,18));
		t.setForeground(Color.YELLOW);
		t.setBackground(Color.BLUE);
		t2.setEchoChar('*');
		f.add(t);
		f.add(t2);
		f.add(t3);
		f.setSize(400,300);
		f.setVisible(true);
		try
		{
			Thread.sleep(8000);
		}
		catch(Exception e)
		{}
		System.out.println(t.getText());
		System.out.println(t2.getText());
		t.setText("World");
		t3.setEditable(false);
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{}
		t3.setEnabled(false);
	}
}