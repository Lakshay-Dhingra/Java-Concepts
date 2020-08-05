import java.io.*;
  class ReadEmp
        { public static void main(String args[]) throws  IOException
               {  FileInputStream   fin =new FileInputStream( "d:\\demo_io\\myemp.txt");
                   ObjectInputStream din = new ObjectInputStream( fin );
                    try 
                            {
                                    Emp  eobj;  //  ref. variable
                                    eobj  =           (Emp) din.readObject();    
                            //     public  Object  readObject ()   throws ClassNotFoundException ,IOException
                                           eobj.showData();
                  }catch(Exception e)
                                                      { System.out.println(e); }
               din.close();
               fin.close();  
            }
       }
   //  readObject  ()  this method will perform deserialization
   //    at first  pick data from underlying  low level strream
     //   create object  in heap--  for creation of object 
    //                                                     at first this method load meta info of  class
    //      note:    ensure   .class file  of  concerned class object  is present in current folder
    //        if  .class file is not found in current folder then  this method will raise  ClassNotFoundException

     //     initialize newly created object with   deserialized data.
    //  will return  reference of  newly created object. 