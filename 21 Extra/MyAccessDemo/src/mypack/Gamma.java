package mypack;

public class Gamma extends mypack.Alpha {

	public void show()
	{
	System.out.println( super.def_data);
	System.out.println( super.pub_data);
	System.out.println( super.pro_data);
	}
	public static void main(String args[])
	{
		Gamma  gobj   = new Gamma();
		gobj.show();
	}
}
