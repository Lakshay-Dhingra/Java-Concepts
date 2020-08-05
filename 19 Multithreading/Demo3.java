//main thread -- stop()

class Demo3
{
	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println("Some working");
		t.stop();
		System.out.println("In Main....");
	}
}