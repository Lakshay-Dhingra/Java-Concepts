import java.io.*;
import java.util.*;

class Demo23
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter fout =new FileWriter("F:\\LAKSHAY\\CODES\\LearningJava\\18 Java IO\\Alpha4.txt");
			System.out.println("Enter any text to write in file, write exit to stop: ");
			Scanner cin=new Scanner(System.in);
			String str =null;
			while(true)
			{
				str=cin.nextLine();
				if(str.equals("exit"))
					break;
				str=str+"\n";
				fout.write(str,0,str.length());
			}
			fout.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}