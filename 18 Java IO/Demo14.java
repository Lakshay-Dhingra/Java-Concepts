import java.io.*;
class Demo13
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		FileOutputStream fout=new FileOutputStream("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha3.txt",true);
		PrintStream pout=new PrintStream(fout);

		PrintStream temp=System.out;//Copy and store ref of monitor
		System.setOut(pout);

		//
		
	}
}