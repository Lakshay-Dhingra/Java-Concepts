
   import java.io.*;

   class DemoWrite6
     {  public static void main(String args[] )  throws InterruptedException
             {    try {          

                           FileOutputStream   fout   = new  FileOutputStream (  "d:\\demo_io\\somedata.txt"   , true  );
                           PrintStream  pout    = new PrintStream( fout );
             //                  pout.println(  "varun");
               //                pout.println( 23);
                 //              pout.println(  1134.34);
                   //            pout.println(  false);

                            for( int i =1 ; i <=20  ; i ++ )
                                {
                                      pout.println ( " robo - "  + i   );
                                      Thread.sleep(3000);
                                }

                                  pout.close();
                                   fout.close();    
                     }  catch ( IOException  e )                   {    e.printStackTrace();  }
           }
        }  
