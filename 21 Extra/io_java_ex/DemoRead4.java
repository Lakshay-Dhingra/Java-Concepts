

   import java.io.*;


   class   DemoRead4  
     { 
         public static void main(String args[] )
          {   
               try {          

                      FileInputStream   fin   = new  FileInputStream (  args[0]   );

                                                  int   ch  ;
                            StringBuffer   sb   = new StringBuffer( 2000 );

                                                   while ( true )
                                                     {
                                                          ch =  fin.read();
                                                          if ( ch   == -1 )   { break; }
                                                              sb.append( (char) ch );
                                 
                                                       }
                                                          System.out.print (  sb );

                         fin.close();
                     }  catch ( IOException  e )        {  System.out.println(" invalid file name "); }

           }
        }
