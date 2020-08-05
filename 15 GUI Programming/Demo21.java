//adding images
import java.awt.*;
import javax.swing.*;

class Demo21 extends JFrame
{
	JLabel lb1;
	ImageIcon ic;
	JScrollPane jp;

	public Demo21()
	{
		ic = new ImageIcon("F:\\LAKSHAY\\Images\\abc.png");
		lb1=new JLabel(ic);
		jp=new JScrollPane(lb1);
		setLayout(new FlowLayout());
		// jp.setBounds(60,60,40,40);
		jp.setSize(100,100);
		add(jp);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Demo21();
	}
}