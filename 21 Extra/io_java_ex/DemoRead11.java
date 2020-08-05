   import java.io.*;

//  SequenceInputStream
   //  abt   reading of  multiple  file
    //  thinkk ..  if java  program need  contents   of more thn 1  filles.. in   java  applicatin
    //  then  ...   we hv to create  multiple buffer objects   ...  (   for  each  file )
    //   and  we  need to  read  buffer  sprtly  ..   using  loop statement.

  //  to  over  come    this  problem  java provides us   one  High Level  Stream class i.e  
   //  SequenceInputStream  class   
   //    using this  class we can   create  logical  concatenation of  mulple  input buffer...
   //     common  constructor
     //     class SequenceInputStream
     //          {
     //                public  SequenceInputStream  ( InputStream   is1 ,  InputStream  is2 )
     //                           {}
     //          }


   class DemoRead11
     {   public static void main(String args[] )  throws  InterruptedException
          {   
                try {          
                          FileInputStream   fin1   = new  FileInputStream (  "d:\\io_java_ex\\demowrite1.java"    );
                          FileInputStream   fin2   = new  FileInputStream (  "d:\\io_java_ex\\demowrite9.java"    );
                    FileInputStream   fin3   = new  FileInputStream (  "d:\\io_java_ex\\demowrite2.java"    );
                          FileInputStream   fin4   = new  FileInputStream (  "d:\\io_java_ex\\demowrite7.java"    );
            
            SequenceInputStream   sin1   = new  SequenceInputStream ( fin1 , fin2 ) ;
            SequenceInputStream   sin2   = new  SequenceInputStream ( fin3 , fin4 ) ;
            SequenceInputStream   sin3   = new  SequenceInputStream ( sin1 , sin2 ) ;


                                           int   ch  ;
                                                   while ( true )
                                                     {
                                                          ch =  sin3.read();
                                                          if ( ch   == -1 )   { break; }
                                                      System.out.print (  ( char) ch );
                                                        Thread.sleep(10);
                                                       }
                            sin1.close();
                            fin1.close();
                      fin2.close();
                     }  catch ( IOException  e )
                        {    e.printStackTrace();  }
                     System.out.println (" exiting from  main ");
           }
        }
