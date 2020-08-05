interface D
{
	int x=10;	//we must initialize it here //it is by default public static final
}

class Demo4
{
	public static void main(String[] args)
	{
		System.out.println(D.x);	//we can use its variable by name of class
	}
}

//  javap -c D
// Compiled from "Demo4.java"
// interface D {
//   public static final int x;

// }