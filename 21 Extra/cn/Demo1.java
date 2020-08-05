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
			 }		 
			 class Demo1
			    {
				    public static void main(String args[] )
					      {
						    Rect obj   = new Rect();
							   obj.show();
						  }
				}

