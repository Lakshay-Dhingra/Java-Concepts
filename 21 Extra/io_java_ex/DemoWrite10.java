
   import java.io.*;
   import java.util.*;
   class DemoWrite10
     {  public static void main(String args[] )
             {  
                         
   try   (    FileOutputStream   fout =  new  FileOutputStream (  "d:\\demo_io\\mydata.txt"   , true  );    DataOutputStream  dout   = new   DataOutputStream (  fout ) )
             {                        
                             String  name  ;        double   salary;                   int  age  ;

                               Scanner  cin    = new Scanner ( System.in );
                                 System.out.print (" Enter name  " ) ;    name   = cin.nextLine();
                                 System.out.print (" Enter age " ) ;   age   = cin.nextInt();
                                 System.out.print (" Enter salary " ) ;    salary   = cin.nextDouble();


                                      dout.writeUTF ( name );  
                                        dout.writeInt( age ); 
                                     dout.writeDouble( salary );

                     }  catch ( IOException  e )  
                               {   System.out.println( " unable to open... ");  }
           }
        }  
