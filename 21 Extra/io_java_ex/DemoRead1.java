   import java.io.*;
   class DemoRead1
     {   public static void main(String args[] )
          {    try {          
                      FileInputStream   fin   = new  FileInputStream (  "d:\\demo_io\\alpha.txt"    );
//                           public  int  read ()  throws  IOExcetpino 
  //                 can read  one byte of data from  buffer
//                   if  we  call read()  method 
  //                    after  reading one  byte of data ..  thn next time it automatically pick next 
    //                 byte  of data from  file buffer
   // note  when  end of  file is reached thn  read()  method will return value  - 1  to  java  program

    //                           int  x =   fin.read();
      //                          System.out.println( x );
 //                               x =   fin.read();
   //                             System.out.println((char) x );
//                                x =   fin.read();
  //                              System.out.println( (char) x );

                                           int   ch  ;
                                                   while ( true )
                                                     {
                                                          ch =  fin.read();
                                                          if ( ch   == -1 )   { break; }
                                                      System.out.print (  ( char) ch );
                                                       }
                            fin.close();
                     }  catch ( IOException  e )
                        {    e.printStackTrace();  }
                     System.out.println (" exiting from  main ");
           }
        }
