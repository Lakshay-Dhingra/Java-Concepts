//main thread -- exception
class Demo2
{
	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println("Some working");
		t.setName("Modi");
		int x=10/0;

	}
}