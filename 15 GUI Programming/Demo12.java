//Calculator

import java.awt.*;
import java.awt.event.*;
import javax.swing.*:

class MyFrame extends JFrame implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton add_btn,mul_btn2;
	// Button btn2;
	MyFrame()
	{
		add_btn=new Button("+");
		mul_btn=new Button("X");
		tf1=new TextField(10);
		tf2=new TextField(10);
		tf3=new TextField(10);
		setLayout(new FlowLayout());
		add(add_btn);
		add(mul_btn);
		add(tf1);
		add(tf2);
		add(tf3);
		tf3.setEditable(false);
		// System.out.println(btn.hashCode());
		MyListener ml=new MyListener();
		add_btn.addActionListener(this);
		mul_btn.addActionListener(this);
		
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		JButton temp=(JButton)e.getSource();
		try
		{
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int res=a+b;
		}
		catch()
		{
				
		}
	}

	public static void main(String[] args)
	{
		new MyFrame();
		// new MyFrame();
	}
}
