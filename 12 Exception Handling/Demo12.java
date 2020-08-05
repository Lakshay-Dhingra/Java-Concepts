class Demo12
{
	public static void main(String[] args) throws InterruptedException
	{
		Alpha.thinking();
	}
}

class Alpha
{
	public static void thinking() throws InterruptedException
	{
		System.out.println("Let me think");
		Thread.sleep(3000);
		System.out.println("I got it...");
	}
}