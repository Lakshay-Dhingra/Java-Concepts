   import java.io.*;
   class DemoWrite3
     {
       public static void main(String args[] )
          {
               try {          
                      byte  res[] ;
                      FileOutputStream   fout   = new  FileOutputStream (  "d:\\demo_io\\demo.txt"    );

                             String  name  = "arun kumar";
                             double   salary  = 56789.34;
                              int  age  =23;

                                  res   =  name.getBytes();
                                  fout.write(res );      fout.write(  "   ".getBytes() );
                                 res  =          String.valueOf( salary  ). getBytes();
                    
                                fout.write(res );   fout.write(  "   ".getBytes() );

                                 res  =          String.valueOf( age  ). getBytes();  
                                 fout.write(res );    fout.write("\n".getBytes() );
                                   fout.close();    
                     }  catch ( IOException  e )                   {    e.printStackTrace();  }
           }
        }  //  note  :  in case of    FileOutputStream  if   mentioned file is not present on  given location
                //  thn     java automatically  create an empty file and then write data to it.
            //  same  rule is   not applicable in case of  FileInputStream    
