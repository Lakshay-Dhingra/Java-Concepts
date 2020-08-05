     import static java.lang.System.out;
	 import java.util.*;
//using final keyword

         class Rect6
             {
 			   private final double length;
			   private final double breadth;
			   
				public void show()
			      {
	                out.println( length +  "  "   + breadth );
				  }
				  
				  Rect6( double length , double breadth )
				  {
					  this.length  = length;
					  this.breadth = breadth;
				  }
				  
				  Rect6()
				  {
					  length   =10;
					  breadth = 50;
				  }
				}		 
			 class Demo6
			 {
				    public static void main(String args[] )
					      {
						    Rect6 obj1   = new Rect6();
							   obj1.show();
							   
							   Rect6 obj2   = new Rect6();
							   obj2.show();
							   
							   Rect6 obj3 = new Rect6( 566,777 );
							           obj3.show();
						  }
				}

