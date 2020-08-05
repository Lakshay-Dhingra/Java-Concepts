//insert,delete and replace
class Demo6
{
	public static void main(String[] args)
	{

		StringBuffer sb2=new StringBuffer(5);
		sb2.append("ABCDE");
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

		sb2.insert(2,false);
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

		sb2.insert(3,2.567);
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

		sb2.delete(2,9);
		System.out.println("sb2 = "+sb2);
		System.out.println("sb2 capacity = "+sb2.capacity());
		System.out.println("sb2 length = "+sb2.length());

	}
}