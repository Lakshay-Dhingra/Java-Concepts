//Multiple Inheritance in interface

interface A
{
	void showA();
}

interface B
{
	void showB();
}

interface C extends A,B
{
	void showC();
}

class D implements C
{
	public void showA()
	{
		System.out.println("A");
	}
	public void showB()
	{
		System.out.println("B");
	}
	public void showC()
	{
		System.out.println("C");
	}
}

class Demo16
{
	public static void main(String[] args)
	{
		C obj=new D();
		obj.showA();
		obj.showB();
		obj.showC();	
	}
}