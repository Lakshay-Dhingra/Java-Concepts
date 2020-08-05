import java.io.*;
class Demo13
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		System.err.println(2.134);
		PrintStream p=System.out;
		p.println("World");
		p.print(true);
	}
}