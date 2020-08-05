//writing string to buffer
//writing double/long/other data to buffer
import java.io.*;
class Demo8
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha.txt");
			byte arr[]="arun kumar ".getBytes();
			fout.write(arr);
			double salary=34632.89;
			arr=(String.valueOf(salary)+" ").getBytes();
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