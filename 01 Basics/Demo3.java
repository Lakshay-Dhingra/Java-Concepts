import static java.lang.System.out;
import java.util.*;
class Demo3
{
	public static void main(String args[])
	{
		int age=0;
		double salary=0.0;
		System.out.println("Enter Age:");
		Scanner obj= new Scanner(System.in);
		age=obj.nextInt();
		out.println("Enter Salary");
		salary=obj.nextDouble();
		out.println("Age: "+age+" Salary: "+salary);
	}
}
