

   import java.io.*;

   class   DemoRead3
     {   public static void main(String args[] )
          {   
               try {          

                      FileInputStream   fin   = new  FileInputStream (  args[0]   );

                                                  int   ch  ;
                                                   while ( true )
                                                     {
                                                          ch =  fin.read();
                                                          if ( ch   == -1 )   { break; }
                                                          System.out.print (  ( char) ch );
                                 
                                                       }
                         fin.close();
                     }  catch ( IOException  e )        {  System.out.println(" invalid file name "); }

           }
        }
