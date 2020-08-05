class Student
{
	private String name;
	private long phno;
	private final int rollno;
	private static String course;
	private static String time;
	private static int setroll;
	
	static
	{
		course="JAVA";
		time="5:00 p.m.";
		setroll=1;
	}
	//init()
	{
		rollno=setroll;
		setroll++;
	}
	Student()
	{
		name="N/A";
		phno=0;
	}
	Student(String name,long phno)
	{
		this.name=name;
		this.phno=phno;
	}
	void changePhno(long newphno)
	{
		phno=newphno;
	}
	static void changeCourse(String newcourse)
	{
		course=newcourse;
	}
	void show()
	{
		System.out.println("Name: "+name+" RollNo.: "+rollno+" Course: "+course+" PhNo.: "+phno+" BatchTime: "+time);
	}
}

class Demo7
{
	public static void main(String[] args) {
		
		Student sobj1=new Student("Ayush",999882346);
		Student sobj2=new Student("Ram",87549023);
		Student sobj3=new Student();
		sobj1.show();
		sobj2.show();
		sobj3.show();
	}
}