     import static java.lang.System.out;
	 import java.util.*;


         class Rect8
             {
 			   private final double length;
			   private final double breadth;
			   
			   {
				  length =4;
				  breadth =6;
			   }
				public void show()
			      {
	                out.println( length +  "  "   + breadth );
				  }
				  Rect8( double length , double breadth )
				  {
					 // this.length  = length;
					 // this.breadth = breadth;
				  }
				  Rect8()
				  {	}
				}		 
			 class Demo8
			 {
				    public static void main(String args[] )
					      {
						    Rect8 obj1   = new Rect8();
							   obj1.show();
							   
							   Rect8  obj3 = new Rect8( 566,777 );
							           obj3.show();
						  }
				}

