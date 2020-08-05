//Source

import java.awt.*;

class MyFrame extends Frame
{
	Button btn;
	// Button btn2;
	MyFrame()
	{
		btn=new Button("OK");
		// btn2=new Button("Hello");
		setLayout(new FlowLayout());
		add(btn);
		// add(btn2);
		// System.out.println(btn.hashCode());
		MyListener ml=new MyListener();
		btn.addMouseListener(new MyMouse());
		btn.addActionListener(ml);

		// btn2.addMouseListener(new MyMouse());
		// btn2.addActionListener(ml);

		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame();
		// new MyFrame();
	}
}
