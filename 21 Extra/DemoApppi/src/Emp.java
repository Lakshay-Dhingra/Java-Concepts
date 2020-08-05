
public class Emp 
{
	  private   int   id;
      private String  name;
      private  double   salary;
      public void  getData()
             {
             System.out.print("Enter id");    
                        id   = MyInput.cin.nextInt( );
             System.out.print("Enter name");
                                 MyInput.cin.nextLine(); // to clear buffer
                       name   = MyInput.cin.nextLine();
            System.out.print("Enter salary");                       
                       salary    = MyInput.cin.nextDouble();
              }

	public void show() {
	System.out.println( " Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}
      
}
