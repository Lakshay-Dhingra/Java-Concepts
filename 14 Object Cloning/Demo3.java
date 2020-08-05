//Deep Copy

class Address implements Cloneable
{
	private String city;
	private String state;
	Address()
	{}
	Address(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
	public void show()
	{
		System.out.println(city+" "+state);
	}
	public Address clone() throws CloneNotSupportedException
	{
		return (Address)super.clone();
	}
}


class Student implements Cloneable
{
	private int id;
	private String name;
	private Address stud_addr;
	Student()
	{}
	Student(int id,String name,String city,String state)
	{
		this.id=id;
		this.name=name;
		stud_addr=new Address(city,state);
	}
	public void show()
	{
		System.out.print(id+" "+name+" "+stud_addr+" ");
		stud_addr.show();

	}
	public Student clone() throws CloneNotSupportedException
	{
		Student stemp= (Student)super.clone();
		stemp.stud_addr=(Address)this.stud_addr.clone();
		return stemp;
	}
}

class Demo3
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student r1=new Student(123,"abc","rohtak","HR");
		Student r2=r1.clone();
		System.out.println("r1: "+r1);
		System.out.print("r1: ");r1.show();
		System.out.println("r2: "+r2);
		System.out.print("r2: ");r2.show();	

		// r1.stud_addr.city="Chd";
		// System.out.print("r1: ");r1.show();
		// System.out.print("r2: ");r2.show();		
	}
}