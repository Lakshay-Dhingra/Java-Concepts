import java.sql.*;
import java.util.*;

public class DemoJdbc2
   {public static void main(String[] args)   throws   InterruptedException 
         {  try
              { Class.forName("com.mysql.jdbc.Driver");
                 Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb11","root","root");        
                 Statement  stmt = conn.createStatement( );
                 ResultSet  rs =stmt.executeQuery("select * from  modistaff ");

             




                    while( rs.next() )
	     {
	 System.out.println(	rs.getInt(1)  +  "   "    + rs.getString("name")  +  "   "  + rs.getInt(3)  );
                   Thread.sleep(700);
	    }
 
                       rs.close();    stmt.close();    conn.close();     
                 }catch ( ClassNotFoundException e )  {e.printStackTrace();}
                   catch ( SQLException  e)                    {e.printStackTrace();}
	}
        }
