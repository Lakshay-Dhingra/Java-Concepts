//using DataOutputStream
//Take input from user
import 
import java.io.*;
class Demo8
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha2.txt");
			DataOutputStream dout=new DataOutputStream(fout,true);
			String name;double salary;int age;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exiting Main...");
	}
}