import java.awt.*;
class Demo4
{
	public static void main(String[] args) {
		new MyFrame();
		new MyFrame("myframe",333,444);
	}
}

class MyFrame extends java.awt.Frame
{
	MyFrame(){
	super("Login");	//call to cconstructor of parent class
	super.setSize(300,400);
	super.setVisible(true);}
	MyFrame(String str,int x,int y){
	super(str);
	super.setLocation(x,y);
	super.setSize(300,400);
	super.setVisible(true);}
}