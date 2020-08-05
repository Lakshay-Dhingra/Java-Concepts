     import static java.lang.System.out;
	 import java.util.*;


         class Rect
             {
 			   private final double length=55;
			   private final double breadth=77;
			   
			   {
				 //  length =4;
				 //  breadth =6;
			   }
				public void show()
			      {
	                out.println( length +  "  "   + breadth );
				  }
				  Rect( double length , double breadth )
				  {
					 // this.length  = length;
					 // this.breadth = breadth;
				  }
				  Rect()
				  {
					  
				  }
				}		 
			 class Demo12
			 {
				    public static void main(String args[] )
					      {
						    Rect obj1   = new Rect();
							   obj1.show();
							   
							   Rect  obj3 = new Rect( 566,777 );
							           obj3.show();
						  }
				}

