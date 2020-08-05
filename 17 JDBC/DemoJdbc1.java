import java.sql.*;
import java.util.*;
public class DemoJdbc1 
   {public static void main(String[] args) 
         {    
            try
              { Class.forName("com.mysql.jdbc.Driver");
                 Connection conn=DriverManager.getConnection("jdbc:mysql://root@localhost/mydb11","root","root");        
                 PreparedStatement  stmt = conn.prepareStatement( "insert into modistaff values(?,?,?)");
                 Scanner cin    = new Scanner (System.in);
                 String ans;
                 do  {    System.out.print("Enter id ");
                            int  id   =  cin.nextInt();
                            System.out.print("Enter name ");
                                                     cin.nextLine();  // used to clear buffer 
                             String  name   =  cin.nextLine();
                             System.out.print("Enter salary ");
                             int  salary   =  cin.nextInt();
                             stmt.setInt(1,id);     stmt.setString(2,name);     stmt.setInt(3,salary);         
                               stmt.addBatch();

                             System.out.println(" one row updated");
                             System.out.print("wld u lk to input 1 more record ");
                              cin.nextLine();  // to clean buffer
                              ans = cin.nextLine();
                         }while( ans.equals("y"));

                            stmt.executeBatch();

                           stmt.close();    conn.close();     
                 }catch ( ClassNotFoundException e )  {e.printStackTrace();}
                   catch ( SQLException  e)                    {e.printStackTrace();}
	}
        }
