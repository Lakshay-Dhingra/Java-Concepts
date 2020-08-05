import java.io.*;
  class WriteEmp
        {   public static void main(String args[]) throws IOException
               {
         FileOutputStream   fout =new FileOutputStream( "d:\\iodata\\myemp.txt");
         ObjectOutputStream dout = new ObjectOutputStream( fout );
              try 
                  {  
                      Emp eobj=new Emp();
                      eobj.getData();
                      dout.writeObject(eobj);                  //    public   void   writeObject( Object ob );
                  }catch(Exception e)    { System.out.println(e); }
                  dout.close();   fout.close();
            }
       }








