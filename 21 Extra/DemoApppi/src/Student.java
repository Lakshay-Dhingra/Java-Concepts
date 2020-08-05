
public class Student {
	  private   int   id;
      private String  name;
      private  double   fee;
      public void  getData()
             {
             System.out.print("Enter id");    
                        id   = MyInput.cin.nextInt( );
             System.out.print("Enter name");
                                 MyInput.cin.nextLine(); // to clear buffer
                       name   = MyInput.cin.nextLine();
            System.out.print("Enter fee");                       
                       fee    = MyInput.cin.nextDouble();
              }

	public void show() {
	System.out.println( " Emp [id=" + id + ", name=" + name + ", fee=" + fee + "]");
	}
}
