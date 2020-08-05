
   import java.io.*;
   import java.util.*;
   class DemoWrite9
     {  public static void main(String args[] )
             {  
                          FileOutputStream   fout = null;
                           DataOutputStream  dout = null; 

                   try {          
                              fout   = new  FileOutputStream (  "d:\\demoeee_io\\mydata.txt"   , true  );
                            dout   = new   DataOutputStream (  fout );

                             String  name  ;        double   salary;                   int  age  ;

                               Scanner  cin    = new Scanner ( System.in );
                                 System.out.print (" Enter name  " ) ;    name   = cin.nextLine();
                                 System.out.print (" Enter age " ) ;   age   = cin.nextInt();
                                 System.out.print (" Enter salary " ) ;    salary   = cin.nextDouble();


                                      dout.writeUTF ( name );  
                                     int  x   =  6/ 0;
                                        dout.writeInt( age ); 
                                     dout.writeDouble( salary );

                     }  catch ( IOException  e )  
                               {   System.out.println( " unable to open... ");  }
                            finally 
                                {
                                   try   {
                          if (  dout != null    ||   fout != null )
                                 {
                                  dout.close();    
                                   fout.close();    
                                 }
                                          } catch (  IOException  e   )    {  e.printStackTrace();   }
                                }
 
           }
        }  
  //  more  abt closing of  io buffer..
   //    generally  we  close  buffer at the end of   java module..
    //    closing  of buffer  ensure  proper flushing of   data to  destination device.
    //       will deallocate resource   given  in buffer 
    //        it is  good  programming  practice to  close buffer  at end of  module.
    //     but   "THINK ?? "  what   will  happen   if    some  exception may occur  during  read write operation  
     //       in case of exception  program control will directly jump out of   try..  catch  construct  which 
    //      leaves    io buffer   unclosed..  

    // to  overcome  this   closing  prob.. in   jdk1.7     java  provides  us   concept of     Closeable   buffer
    //   means  now   java programmer are  not accountable for closing of   io  buffer
    //    java will close  ur  io  buffer  automatically  ..   
    //             try  with   resource  statement  is  used for  this  purpose 
     //    syntax     :
                                   try   (   resource  decl  statement  )
                                           {
                                                .....  body of   try  resource  statement
 
                                            }  catch  (  .... )
                                                   {
                                                   }
                                                finally 
                                                    {
                                                    }

    //  here  resource  means  object  of   some  input   output  buffer 

    //      try  with  resource statement  works  only   for  those    input  output   stream  class  which  are  of type 
    //      Closeable 

   //    AutoCloseable    :       is a  built in  interface of  java     introduced in jdk1.7

        //     a  stream  class  which  implements  this   interface   is only  allowed with  try  with resource statement.

       //     this interface  purpose only one  abstract method   i.e    public void  close()
       //     this  interface belong to  java.lang  package.

     //           interface  AutoClosable 
     //                    {
     //                           public void  close() ;
     //                    }

    
                         try (   FileOutputStream   fout    = new  FileOutputStream("d:\\demo_io\\abc.txt)  ) 
                               {

                               }

               
 


        


  







