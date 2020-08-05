//using string buffer to improve performance
import java.io.*;
class Demo5
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin=new FileInputStream("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha.txt");
			StringBuffer sb=new StringBuffer(2000);
			int x;
			while(true)
			{
				x=fin.read();
				if(x==-1)
					break;
				sb.append((char)x);
			}
			fin.close();
			System.out.println(sb);
		}
		catch(IOException e)
		{
			System.out.println("File Not Found!");
		}
		System.out.println("Exiting Main...");
	}
}