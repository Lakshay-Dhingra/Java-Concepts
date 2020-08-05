import java.io.*;
class Demo
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha.txt");
			fout.write(97);
			fout.write(98);
			fout.write(99);
			fout.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exiting Main...");
	}
}