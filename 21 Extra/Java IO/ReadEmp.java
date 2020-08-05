import java.io.*;
  class ReadEmp
        { public static void main(String args[]) throws  IOException
               {  FileInputStream   fin =new FileInputStream( "d:\\iodata\\myemp.txt");
                   ObjectInputStream din = new ObjectInputStream( fin );
                    try 
                            {

                                    Emp  eobj;
                                    eobj  =           (Emp) din.readObject();    

                            //     public  Object  readObject ()   throws ClassNotFoundException ,IOException


                                           eobj.showData();

                  }catch(Exception e)
                                                      { System.out.println(e); }
               din.close();
               fin.close();  
            }
       }