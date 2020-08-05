//Source and Listener in Same class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*:
class MyFrame extends JFrame implements ActionListener
{
	Button btn;
	// Button btn2;
	MyFrame()
	{
		btn=new Button("OK");
		setLayout(new FlowLayout());
		add(btn);
		// add(btn2);
		// System.out.println(btn.hashCode());
		MyListener ml=new MyListener();
		btn.addMouseListener(new MyMouse());
		btn.addActionListener(ml);

		// btn2.addMouseListener(new MyMouse());
		// btn2.addActionListener(ml);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame();
		// new MyFrame();
	}
}
