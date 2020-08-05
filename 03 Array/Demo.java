import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		int x[]=new int[3];
		int y[];
		y=x;
		y[0]=2;
		y[2]=3;
		System.out.println("x: "+x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("x["+i+"] = "+x[i]);
		}
		System.out.println("y: "+y);
		for(int i=0;i<y.length;i++)
		{
			System.out.println("y["+i+"] = "+y[i]);
		}
	}
}