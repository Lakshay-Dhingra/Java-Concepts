interface Shape
{
	void show();	//by default access mode is public
}

class Demo3
{
	public static void main(String[] args)
	{

		// new Shape(); // Not allowed
		Shape sobj; 	//Allowed to make reference var.
	}
}


// javap -c Shape
// interface Shape
// {
// 	public abstract void show();
// }