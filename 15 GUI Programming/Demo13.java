//using lambda with actionlistener
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	Button btn;
	Button btn2;
	TextField tf;
	MyFrame()
	{
		btn=new Button("ok");
			add(tf=new TextField(20));
			add(btn);
			add(b=new Button("Cancel"));
		btn.addActionListener((e)->{tf.setText("hello");})
	}
} 