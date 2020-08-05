//static and dynamic binding
class A
{
	A()
	{
		System.out.println("Class A Constructor");//Static Binding
	}
	void myprint()
	{
		System.out.println("1. Class A");//Dynamic Binding
	}
	static void myprint2()
	{
		System.out.println("2. Class A");//Static Binding
	}
}
class B extends A
{
	B()
	{
		System.out.println("Class B Constructor");//Static Binding
	}
	void myprint()
	{
		System.out.println("1. Class B");
	}
	static void myprint2()
	{
		System.out.println("2. Class B");
	}
}

class Demo6
{
	public static void main(String[] args) {
	A aobj= new B();	//upcasting
	aobj.myprint();
	aobj.myprint2();
	}
}