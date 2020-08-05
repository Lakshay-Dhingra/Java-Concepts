
public class Person 
{
   private int  id;
    private String  name;
    private long  contact;
    
   public  void  getData()
            {
System.out.println(" Enter id ");
           id  =  MyInput.cin.nextInt();
System.out.println(" Enter  name ");
                    MyInput.cin.nextLine();  // used to clear buffer
          name  =   MyInput.cin.nextLine();
System.out.println(" Enter contact ");
          contact   = MyInput.cin.nextLong();
            }
    public  void show()
             {
System.out.print( id  +  "   "   + name  +  "    "   + contact );
            }
  }
