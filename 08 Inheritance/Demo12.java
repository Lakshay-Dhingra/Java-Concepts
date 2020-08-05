class Emp
{
	private int id;
	private String name;
	private double salary;
	Emp()
	{
	}
	Emp(int id,String name,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	@Override
	public String toString()
	{
		return ("Id: "+id+" Name: "+name+" Salary: "+salary);
	}

	@Override
	public boolean equals(Object obj)
	{
		Emp myobj=(Emp)obj;
		return (this.id==myobj.id)&&(this.name.equals(myobj.name))&&(this.salary==myobj.salary);
	}
}

class Demo12
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp(111,"vikas",23345);	
		Emp e2=new Emp(111,"vikas",23345);
		if(e1.equals(e2))
		{
			System.out.println("Both Objects are Equal.");
		}
		else
		{
			System.out.println("Both Objects are Not Equal!");
		}
		System.out.println(e1);
		System.out.println(e2);
	}
}