
public class Emp extends Person
{
	private   String    desig ;
    private  double   salary;
    public void  getData()
             {
    	      super.getData();
               System.out.println(" Enter  desig ");
                        MyInput.cin.nextLine();
               desig  = MyInput.cin.nextLine();
               System.out.println(" Enter salary ");
               salary  = MyInput.cin.nextDouble();
             }
    public   void  show()
            {
    	super.show();
System.out.println( " " + desig  +  "   "   + salary );
           }
}
