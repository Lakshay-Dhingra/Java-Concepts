package mypack;

public class Alpha {

	private     int  pri_data=190;
	protected   int  pro_data=290;
	public      int  pub_data=390;
	            int  def_data=490;
	

	public static void main(String[] args) {
      Alpha  obj   = new Alpha();
      System.out.println(obj.pri_data);
      System.out.println(obj.pro_data);
      System.out.println(obj.def_data);
      System.out.println(obj.pub_data);
	}
		
}
