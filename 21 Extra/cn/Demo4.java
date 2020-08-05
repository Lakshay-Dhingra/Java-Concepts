              import static java.lang.System.out;
         class Rect
             {
			   private double length;
			   private double breadth;
			   private String outlinecolor;
			   Rect()
			   {
				   out.println("zero param constructor get fired");
				   length=2 ; breadth = 5 ; outlinecolor="red";
			   }
			   public void show()
			      {
				  out.println( length +  "  "   + breadth + " "+ outlinecolor );
				  }
		       Rect(int l , int b  , String col)
				{
				   out.println("2 param constructor get fired");

				length =l; breadth = b ; outlinecolor= col;
				}				
			 }		 
			 class Demo4
			 {
				    public static void main(String args[] )
					      {
						    Rect obj1   = new Rect();
							   obj1.show();
   						    Rect obj2   = new Rect(44,55,"cyan"	);
							   obj2.show();

						  }
				}

