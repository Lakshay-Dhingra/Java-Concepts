
public class Emp extends Person
{
	private  String desig;
    private double salary;
    private Address emp_add;
    public Emp()
    {
    	emp_add = new Address();
    }
    public void getData()
    {
         super.getData();
    	System.out.print("Enter desig ");
    	             MyInput.cin.nextLine();
    	this.desig = MyInput.cin.nextLine();
    	
    	System.out.print("Enter salary ");
    	this.salary = MyInput.cin.nextInt();
    	emp_add.getAddress();
    }
    
    public void showData()
    {
    	super.showData();
    	System.out.print( desig +  "  "+ salary);
    	emp_add.showAddress();
    }
}
