import static java.lang.System.out;
import java.util.*;
class Demo4
{
	public static void main(String args[])
	{
		int age=0;
		String salary;
		System.out.println("Enter Age:");
		Scanner obj= new Scanner(System.in);
		age=obj.nextInt();
		out.println("Enter Salary");
		obj.nextLine();
		salary=obj.nextLine();
		out.println("Age: "+age+" Salary: "+salary);
	}
}
