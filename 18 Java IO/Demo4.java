//read file using cmd line arguments
//enter file name and loc as cmd line input
import java.io.*;
class Demo4
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin=new FileInputStream(args[0]);
			int x;
			while(true)
			{
				x=fin.read();
				if(x==-1)
					break;
				System.out.println(x);
			}
			fin.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Exiting Main...");
	}
}