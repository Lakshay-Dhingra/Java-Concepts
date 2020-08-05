//Upcasting
class Car
{
	void drivingExp()
	{
		System.out.println("Some Ordinary Car...");
	}
}

class SUV extends Car
{
	void drivingExp()
	{
		System.out.println("Powerful Car...");
	}
}

class Hatchback extends Car
{
	void drivingExp()
	{
		System.out.println("Economic Car...");
	}
}

class Sedan extends Car
{
	void drivingExp()
	{
		System.out.println("Comfortable Car...");
	}
}

class Person
{
	void testDrive(Car cobj)
	{
		if(cobj==null)
			System.out.print("Wrong choice!");
		else{
		System.out.println("Lets Drive...");
		cobj.drivingExp();}
	}
}

class Demo5
{
	public static void main(String[] args)
	{
		int choice=0;
		Person p=new Person();
		System.out.println("1. SUV");
		System.out.println("2. Hatchback");
		System.out.println("3. Sedan");
		System.out.print("Enter Your choice: ");
		java.util.Scanner cin =new java.util.Scanner(System.in);
		choice=cin.nextInt();
		Car cobj= Demo5.getACar(choice);
		p.testDrive(cobj);
	}
	public static Car getACar(int ch)
	{
		if(ch==1)
		{
			return new SUV();
		}
		else if(ch==2)
		{
			return new Hatchback();
		}
		else if(ch==3)
		{
			return new Sedan();
		}
		return null;
	}
}


