
public class Student extends Person
   {
    private String course;
    private int  fee;
    private Address  stud_add;
    Student()
    {
    	stud_add  = new Address();
    }
    public void getData()
    {
    	super.getData();
    	System.out.print("Enter course ");
    	              MyInput.cin.nextLine();
    	this.course = MyInput.cin.nextLine();
    	System.out.print("Enter fee ");
    	this.fee = MyInput.cin.nextInt();
    	stud_add.getAddress();
    	
    }
    public void showData()
    {
    	super.showData();
    	System.out.print(course + "  "+ fee);
    	stud_add.showAddress();
    }
}


