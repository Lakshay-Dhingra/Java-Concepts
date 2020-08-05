   import java.io.*;

  // writing byte array data to ....  buffer
  //  will be useful when  we are   having list of values.... 
    //      public  void write ( byte  barr[] )  throws  IOException 


   class DemoWrite2
     {
       public static void main(String args[] )
          {
               try {          
                      FileOutputStream   fout   = new  FileOutputStream (  "d:\\demo_io\\alpha.txt"    );
                      byte    arr[] = {65,66,67,68,69,70,71,72}  ;

                                   fout.write( arr  );  // writing  array data to  buffer 
                                   fout.close();    

                     }  catch ( IOException  e )                   {    e.printStackTrace();  }

           }
        }
