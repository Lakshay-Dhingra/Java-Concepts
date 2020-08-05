   import java.io.*;
   class DemoWrite1 
     {
       public static void main(String args[] )
          {
               try {          
                      FileOutputStream   fout   = new  FileOutputStream (  "d:\\demo_io\\alpha.txt"    );

      byte    x  ;
     for(   x = 97  ; x <= 122 ; x++ )
              {
                    fout.write( x );
              }
                          fout.close();    
                     }  catch ( IOException  e )
                        {    e.printStackTrace();  }
                     System.out.println (" exiting from  main ");
           }
        }
