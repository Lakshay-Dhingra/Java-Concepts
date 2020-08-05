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
   //  if  we mention return type with Constructor 
  // thn java do not treat as constructor instead java will
   // treat this unit of code just like other non constructor 
   // method..   and jvm do not use this method with object creation
   //  we can call this method just like other method of java class   
		      void Rect(int l , int b  , String col)
				{
				   out.println(" 3 param...   method ");

				length =l; breadth = b ; outlinecolor= col;
				}	
				
			 }		 
			 class Demo5
			 {
				    public static void main(String args[] )
					      {
						    Rect obj1   = new Rect();
							   obj1.show();
   						    Rect obj2   = new Rect();
							   obj2.show();
							   
							   obj2.Rect( 55,66,"green");
                              obj2.show();
						  }
				}

