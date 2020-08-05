     import static java.lang.System.out;
	 import java.util.*;
   // performing user input using constructor.	 
         class Rect4
             { 
             	private double length;
			   private double breadth;
			   private String outlinecolor;
			   
			   Rect4()
			   {   Scanner cin    = new Scanner(System.in); //In big projects cin object is made once but here 
			   												//object is created every time constructor is called.
				   out.println("Enter length");
				   this.length   =  cin.nextDouble();
				   out.println("Enter breadth");
				   this.breadth  = cin.nextDouble();
				   out.println ("Enter outlinecolor ");
				                   cin.nextLine();
				   outlinecolor = cin.nextLine();
			   }

			   	public void show()
			      {
					out.println( length +  "  "   + breadth + " "+ outlinecolor );
				  }
 	       		
 	       		Rect4(double l , double b  , String col)
				{
				length =l; breadth = b ; outlinecolor= col;
				}	
			 }

			 class Demo4
			 {
				    public static void main(String args[] )
					      {
						    Rect4 obj1   = new Rect4();
							   obj1.show();
							   Rect4 obj2   = new Rect4();
							   obj2.show();
							
						  }
				}

