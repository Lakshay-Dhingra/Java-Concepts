

   import java.io.*;

   class DemoRead2
     {   public static void main(String args[] )
          {   
               try {          

                      FileInputStream   fin   = new  FileInputStream (  "d:\\io_java_ex\\demowrite1.java"    );

                                                  int   ch  ;
                                                   while ( true )
                                                     {
                                                          ch =  fin.read();
                                                          if ( ch   == -1 )   { break; }
                                                          System.out.print (  ( char) ch );
                                 
                                                       }
                         fin.close();
                     }  catch ( IOException  e )        {    e.printStackTrace();  }

           }
        }
