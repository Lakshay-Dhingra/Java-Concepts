     import static java.lang.System.out;
	 import java.util.*;


         class Rect7
             {
 			   private final double length=8;
			   private final double breadth=9;
			   
				public void show()
			      {
	                out.println( length +  "  "   + breadth );
				  }
				  Rect7( double length , double breadth )
				  {
					  // this.length  = length;
					  // this.breadth = breadth;
				  }
				  Rect7()
				  {
					  // length   =10;
					  // breadth = 50;
				  }
				}		 
			 class Demo7
			 {
				    public static void main(String args[] )
					      {
						    Rect7 obj1   = new Rect7();
							   obj1.show();
							   
							   Rect7 obj2   = new Rect7();
							   obj2.show();
							   
							   Rect7  obj3 = new Rect7(566,777 );
							           obj3.show();
						  }
				}

