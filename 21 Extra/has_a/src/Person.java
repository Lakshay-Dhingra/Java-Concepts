public class Person
{
  private  int id;
  private  String name;
  private   long contact;
  
	public void getData()
	{
	  	System.out.print("Enter id ");
    	this.id = MyInput.cin.nextInt();
    	System.out.print("Enter name ");
    	             MyInput.cin.nextLine();
    	this.name = MyInput.cin.nextLine();
    	System.out.print("Enter contact ");
    	this.contact = MyInput.cin.nextLong();
	}
	  public void showData()
	    {
	    	System.out.print(id  +  "  " + name +  "  "+ contact);
	    }
}
