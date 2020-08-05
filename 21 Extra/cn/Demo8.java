     import static java.lang.System.out;
	 import java.util.*;
   // performing user input using constructor.	 
         class Rect
             { private double length;
			   private double breadth;
			   private String outlinecolor;
			   
			
			   Rect()
			   {

			   length  =5; breadth =10;
			   }
 	       Rect(double  l , double b  )
				{

				length =l; breadth = b ;
				}	
				public void show()
			      {
	out.println( length +  "  "   + breadth + " "+ outlinecolor );
				  }
   {
                  Scanner cin    = new Scanner(System.in);
				   out.println ("Enter $$$$$$$$$$$$$$$$$$$ outlinecolor ");
				   outlinecolor = cin.nextLine();				   
			   }
			   				  
				}		 
			 class Demo8
			 {
				    public static void main(String args[] )
					      {
						    Rect obj1   = new Rect();
							   obj1.show();
							   Rect obj2   = new Rect(4,6);
							   obj2.show();
							
						  }
				}

			  // concept of  init {}  block
   //   			  
			  