
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
   class DemoWrite5
     {  public static void main(String args[] )
             {    try {          
                           FileOutputStream   fout   = new  FileOutputStream (  "d:\\demo_io\\mydata.txt"   , true  );
                          DataOutputStream  dout   = new   DataOutputStream (  fout );

                             String  name  ;        double   salary;                   int  age  ;

                               Scanner  cin    = new Scanner ( System.in );
                                 System.out.print (" Enter name  " ) ;    name   = cin.nextLine();
                                 System.out.print (" Enter age " ) ;   age   = cin.nextInt();
                                 System.out.print (" Enter salary " ) ;    salary   = cin.nextDouble();


                                      dout.writeUTF ( name );   dout.writeInt( age );  dout.writeDouble( salary );

                                  dout.close();
                                   fout.close();    
                     }  catch ( IOException  e )                   {    e.printStackTrace();  }
           }
        }  
