//writing byte array to buffer
import java.io.*;
class Demo7
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha.txt");
			byte arr[]={65,66,67,68,69};
			fout.write(arr);
			fout.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exiting Main...");
	}
}