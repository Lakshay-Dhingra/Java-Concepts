class Demo6
{
	public static void main(String args[])
	{
		System.out.println(3+4.567);//implicit
		System.out.println(3+(int)4.567);//explicit
		float x;
		x=4.56f;
		// x=4.56; error!
		System.out.println(x);
		System.out.println(x>4.567);
		byte a=10,b=20;
		// byte c=a*b; error
		byte c=(byte)(a*b); 
		int d=a*b;
		System.out.println(c);
		System.out.println(d);
	}
}