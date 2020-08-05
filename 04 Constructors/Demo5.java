     import static java.lang.System.out;
	 import java.util.*;
   // performing user input in constructor using init() block	 
         class Rect5
             { private double length;
			   private double breadth;
			   private String outlinecolor;
			   
			
			   Rect5()
			   {
			   	out.println("Default Constructor");
			   length  =5; breadth =10;
			   }
 	       		
 	       		Rect5(double  l , double b  )
				{
				out.println("Parameterized Constructor");
				length =l; breadth = b ;
				}	
				
				public void show()
			      {
					out.println( length +  "  "   + breadth + " "+ outlinecolor );
				  }
   				
   				{			//init block
                  Scanner cin    = new Scanner(System.in);
				   out.println ("Enter outlinecolor ");
				   outlinecolor = cin.nextLine();				   
			   }
			   				  
				}		 
			 class Demo5
			 {
				    public static void main(String args[] )
					      {
						    Rect5 obj1   = new Rect5();
							   obj1.show();
							Rect5 obj2   = new Rect5(4,6);
							   obj2.show();
							
						  }
				}
