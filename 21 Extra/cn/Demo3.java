              import static java.lang.System.out;
         class Rect
             {
			   private double length;
			   private double breadth;
			   private String outlinecolor;
			   Rect()
			   {
				   out.println("constructor get fired");
				   length=2 ; breadth = 5 ; outlinecolor="red";
			   }
			   public void show()
			      {
				  out.println( length +  "  "   + breadth + " "+ outlinecolor );
				  }
				void  setDetails(int l , int b  , String col)
				{
					length =l; breadth = b ; outlinecolor= col;
				}				
			 }		 
			 class Demo3
			 {
				    public static void main(String args[] )
					      {
						    Rect obj1   = new Rect();
							   obj1.show();
   						    Rect obj2   = new Rect();
							   obj2.show();

						  }
				}

