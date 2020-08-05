class Demo3
{
	public static void main(String[] args)
	{
		String s1="AB";
		String s2=s1;	
		s1=new String("AB");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}