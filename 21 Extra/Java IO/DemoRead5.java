
   //  in previsous approach  when we are writing  double int type data to file  
  //  thn   we are  loosing  datatype info  of  our values  as we are converting these values in string -- and thn to byte 
 //  form ...     so when we are  try to read same data back from file then  it will come in  byte form not in 
  //   double or   int   form

//  to overcome  this problem  java  provides  us   high level stream class 
//   i.e   DataOutputStream   and  DataInputStream  

//    using  DataOutputStream  class we can write  all java primtive type values to  file 
//   along with  datatype info.    in encrypted form.   we can  not view this data in file using ordnary text editor,
//  common  method of  DataOutputStream  class
         //    public void   writeInt(  int x );
         //    public void   writeDouble(  double x );
         //    public void   writeFloat(  float x );
         //    public void   writeLong(  long x );
         //    public void   writeBoolean(  boolean x );
         //   public  void   writeUTF(   String str ) ;
         //  common constructor  
      //                         public  DataOutputStream (  OutputStream   obj )
    //  note  :   this  stream class  works in conjuction to   low level  buffer  object..  
    //                this  stream  class  just perform  conversion of  data. 
    //    to read  this  data back from  file  use   DataInputStream 
  //    works  opposite to  DataOutputStream    
//                              constructor 
  //                                   public  DataInputStream  ( InputStream  obj ) ;
    //      common methods 
      //                      public  int  readInt(    ) ;
        //                    public  double  readDouble(    ) ;
          //                  public  float  readFloat(    ) ;
            //                public  String  readUTF(    ) ;
              //              public  long  readLong(    ) ;
                //            public  boolean  readBoolean(    ) ;

   import java.io.*;
   import java.util.*;
   class DemoRead5
     {  public static void main(String args[] )
             {    try {          
                           FileInputStream   fin   = new  FileInputStream (  "d:\\demo_io\\mydata.txt"     );
                          DataInputStream  din   = new   DataInputStream (  fin );

                             String  name  ;        double   salary;                   int  age  ;

                                while( true )
                                        {
                                      try  {
                                                 name  = din.readUTF ();  
                                                age   = din.readInt(  ); 
                                                salary  =  din.readDouble(  );
                                                System.out.println (   name   +   "    "   + age   +   "    "  +  salary );
                                              }  catch ( EOFException  e )   {    break; }
                                        }

                                     din.close();
                                   fin.close();    
                     }  catch ( IOException  e )                   {    e.printStackTrace();  }
           }
        }  
