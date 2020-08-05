
public class Student extends Person 
{
    private String     course ;
    private double   fee;
      public  void    getData()
              {
    	  super.getData();
 System.out.println(" Enter  course ");
                      MyInput.cin.nextLine();
             course  = MyInput.cin.nextLine();
System.out.println(" Enter fee ");
             fee   = MyInput.cin.nextDouble();     
              }
   public void  show()
              {
	   super.show();
System.out.println( "  " + course  +  "   "   + fee );
              }
}

//  super is the keyword of java
//  using  super keyword  we can access
// details of parent class in child class.

//   using super we can access only those
//  details of parent in child which are provided
//  by parent to its child class.


