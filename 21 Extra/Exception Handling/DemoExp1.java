  // nested try 
    class Demo
          {
                      public static int   division( int x, int y )
                        {  int  res=0;
                                   System.out.println("\n with in div method....");
                                   try
                                      {
                                          res=x/y;
                                      } catch( ArithmeticException e)      {   System.out.println(" catching  error");     }
                               return ( res );
                         }
            
                 public  static void main(String args[])
                       {
                              int  a=10;  int b=2;
                                  int   r=  division( a , b )                                     ;
                              System.out.println( "  res  =  "   + r );
                      }
         }
             








      
                         


















