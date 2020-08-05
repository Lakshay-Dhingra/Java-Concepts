     import static java.lang.System.out;
	 import java.util.*;
   // performing user input using constructor.	 
         class Rect
             { private double length;
			   private double breadth;
			   private String outlinecolor;
			   Rect()
			   {   Scanner cin    = new Scanner(System.in);
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
 	       Rect(double l , double b  , String col)
				{
				length =l; breadth = b ; outlinecolor= col;
				}	
			 }		 
			 class Demo7
			 {
				    public static void main(String args[] )
					      {
						    Rect obj1   = new Rect();
							   obj1.show();
							   Rect obj2   = new Rect();
							   obj2.show();
							
						  }
				}

