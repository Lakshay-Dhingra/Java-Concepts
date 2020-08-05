//  redirection  of  mon buff with some other  stream  buffer.

   import java.io.*;
   import java.util.*;

   class DemoDiv
     {  public static void main(String args[] )  
             {      try  {
                              FileOutputStream   fout    = new FileOutputStream ( "d:\\demo_io\\errlog.txt" ,  true );
                              PrintStream   pout     = new  PrintStream (  fout );

                              

                                    System.setErr( pout );
                        try  {

                                int  x    =   Integer.parseInt (   args[0] );   
                                int  y    =   Integer.parseInt (   args[1] );   
                               int  res   = x / y ;
                                System.out.println(  res );
                              }  catch (  Exception   ee )
                                      {      
                                                 Date  dobj    = new  Date( System.currentTimeMillis() );
                                              System.err.println("=========================================");
                                               System.err.println( dobj.toString() );       
                                             ee.printStackTrace();
                                      }

                             pout.close();  fout.close();
                             } catch (  IOException  e   )     {  e.printStackTrace();   } 

           }
        }  

   














   