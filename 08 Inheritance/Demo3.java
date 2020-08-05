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
		System.out.println("Parent money = "+money);
	}
}

class Child extends Parent
{
int money;
Child()
	{
		money=2000;
	}
Child(int x)
	{
		super(x*2);
		money = x/2;
	}
	void show()
	{
		super.show();
		System.out.println("Child money = "+money);
	}
}

class Demo3
{
	public static void main(String[] args) 
	{
		Child cobj2=new Child(2000);	
		cobj2.show();	
	}
}