import java.util.*;

class Student
{
	private int id;
	private String name;
	private String course;
	private double fee;

	public void getDetails()
	{
	Scanner cin= new Scanner(System.in);
	System.out.println("Enter Id:");
	id= cin.nextInt();
	System.out.println("Enter Name:");
	cin.nextLine();
	name= cin.nextLine();
	System.out.println("Enter Course:");
	course= cin.nextLine();
	System.out.println("Enter Fee:");
	fee= cin.nextDouble();
	}

	public void showDetails()
	{
	System.out.println(id+" "+name+" "+course+" "+fee);
	}
}

class Demo
{
	public static void main(String args[])
	{
		Student obj= new Student();
		System.out.println("Obj address: "+ obj);
		obj.getDetails();
		obj.showDetails();
	}
}