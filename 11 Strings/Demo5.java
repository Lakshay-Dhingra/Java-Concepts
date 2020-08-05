//append
class Demo5
{
	public static void main(String[] args)
	{
		// StringBuffer sb1=new StringBuffer();
		// System.out.println("sb1 = "+sb1);
		// System.out.println("sb1 capacity = "+sb1.capacity());
		// System.out.println("sb1 length = "+sb1.length());

		StringBuffer sb2=new StringBuffer(5);
		StringBuffer temp=sb2;
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

		sb2.append("ABCDE");
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

		sb2.append("123456789123456789");
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

		sb2.append("BD");
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

		System.out.println(temp==sb2);	//ref of StringBuffer Obj doesnt change

		StringBuffer sb3=new StringBuffer(5);
		sb3.append("ABC").append("XY");
		System.out.println("sb3 = "+sb3);

		sb3.append('c').append(23).append(45.2);
		System.out.println("sb3 = "+sb3);
	}
}