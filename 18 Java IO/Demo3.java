import java.io.*;
class Demo3
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin=new FileInputStream("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha.txt");
			int x;
			do
			{
				x=fin.read();
				System.out.println(x);
			}while(x!=-1);
			fin.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exiting Main...");
	}
}