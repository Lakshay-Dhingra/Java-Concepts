class Alpha6
{
	private static int x;
	private int y;
	public static void setval()
	{
		java.util.Scanner cin= new java.util.Scanner(System.in);
		System.out.print("Enter value for x: ");
		x=cin.nextInt();
	}
	public void showy()
	{
		System.out.println("y = "+y);
	}
	public static void getval()
	{
		// showy();
		setval();//Static method that can call another static method in its body
		System.out.println("x = "+x);
		// System.out.println("y = "+y);
	}
}

class Demo6
{
	public static void main(String[] args) 
	{
		Alpha6.getval();
		Alpha6 obj=new Alpha6();
		obj.showy();
	}
}