class Demo4
{
	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer();
		System.out.println("sb1 = "+sb1);
		System.out.println("sb1 capacity = "+sb1.capacity());
		System.out.println("sb1 length = "+sb1.length());

		StringBuffer sb2=new StringBuffer(5);
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

		StringBuffer sb3=new StringBuffer("ABC");
		System.out.println("sb3 = "+sb3);
		System.out.println("sb3 capacity = "+sb3.capacity());
		System.out.println("sb3 length = "+sb3.length());

	}
}