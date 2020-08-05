//Concept of String Constant Pool

class Demo2
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1=="hello");
		System.out.println(s1==new String("hello"));
		System.out.println("AB"=="A"+"B");
		String s4="B";
		System.out.println("AB"=="A"+s4);
		System.out.println("A"+"B"+"C"=="ABC");
	}
}