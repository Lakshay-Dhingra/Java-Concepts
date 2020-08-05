     import static java.lang.System.out;
	 import java.util.*;


         class Rect
             {
 			   private final double length=8;
			   private final double breadth=9;
			   
				public void show()
			      {
	                out.println( length +  "  "   + breadth );
				  }
				  Rect( double length , double breadth )
				  {
					  this.length  = length;
					  this.breadth = breadth;
				  }
				  Rect()
				  {
					  length   =10;
					  breadth = 50;
				  }
				}		 
			 class Demo9
			 {
				    public static void main(String args[] )
					      {
						    Rect obj1   = new Rect();
							   obj1.show();
							   
							   Rect obj2   = new Rect();
							   obj2.show();
							   
							   Rect  obj3 = new Rect( 566,777 );
							           obj3.show();
						  }
				}

