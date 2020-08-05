class  MyStream implements  AutoCloseable
     {
              MyStream()
                    {
                     System.out.println( "  buffer get created ") ;
                     }
                public void   read()
                    {  System.out.println( " reading data from  device ");   }

              public void  close()
                   {
                       System.out.println( "  closing of custom buffer" );
                   }
     }
class  YourStream implements  AutoCloseable
     {
              YourStream()
                    {
                     System.out.println( "  buffer of ur stream class get created ") ;
                     }
                public void   read()
                    {  System.out.println( " reading data  through ur stream  ");   }

              public void  close()
                   {
                       System.out.println( "  closing of ur  stream  custom buffer" );
                   }
     }


          class  DemoIO1
               {
                public static void main( String args [] )   throws  InterruptedException 
                      {
                            try    (   MyStream   mout    = new MyStream() ;  YourStream  urobj    = new YourStream() )
                                 {
                                     System.out.println(" in try .. lets  read some data from  buffer");
                                     mout.read();
                                       urobj.read();
                                      
                                              int   x    =   5 / 0;
                                     System.out.println( " coming out of   try with  resource statement.. ");
                                      Thread.sleep( 3000);
                                }    // catch  (   ArithmeticException  e   )     {  System.out.println  (  " handling div error ");   }


                        System.out.println ( "exiting from main.. ");
                      }
                 }

  
 



