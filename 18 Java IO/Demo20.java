//creating our own stream class using AutoCloseable
class MyStream implements AutoCloseable
{
	MyStream()
	{
		System.out.println("Buffer Created...");
		
	}
}

