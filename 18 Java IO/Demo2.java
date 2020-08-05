import java.io.*;
class Demo2
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha.txt",true);
			try
			{
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			byte x;
			for(x=65;x<=90;x++)
			{
				fout.write(x);
			}
			fout.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exiting Main...");
	}
}