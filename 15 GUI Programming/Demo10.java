//listner
import java.awt.*;
import java.awt.event.*;
class MyListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		// System.out.println(e.getSource().hashCode());
		System.out.println("Button Clicked");
	}
}

class MyMouse implements MouseListener
{
	public void mouseEntered(MouseEvent e)
	{
		Button bobj=(Button) e.getSource();
		bobj.setBackground(Color.RED);
		System.out.println("Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		System.out.println("Exited");
	}
	public void mousePressed(MouseEvent e)
	{
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	public void mouseClicked(MouseEvent e)
	{
	}
}