
class Parent
{
	int money;
	Parent()
	{
		money=9000;
	}
	Parent(int x)
	{
		money=x;
	}
	void show()
	{
		System.out.println("money = "+money);
	}
}

class Child extends Parent
{
Child()
	{

	}
Child(int x)
	{
		super(x);
	}
}

class Demo2
{
	public static void main(String[] args) 
	{
		Child cobj1=new Child();
		Child cobj2=new Child(1200);
		cobj1.show();	
		cobj2.show();	
	}
}