import java.sql.*;
import java.util.*;

public class DemoJdbc4
   {public static void main(String[] args)   throws   InterruptedException 
         {  try
              { Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");        
                 Statement  stmt = conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );
                 ResultSet  rs =stmt.executeQuery("select * from  staff_members ");

             



                    while( rs.next() )
	     {
	 System.out.println(	rs.getInt(1)  +  "   "    + rs.getString("name")  +  "   "  + rs.getInt(3)  );
                   Thread.sleep(70);
	    }

                    while( rs.previous() )
	     {
	 System.out.println(	rs.getInt(1)  +  "   "    + rs.getString("name")  +  "   "  + rs.getInt(3)  );
                  Thread.sleep(70);
	    }


                       rs.close();    stmt.close();    conn.close();     
                 }catch ( ClassNotFoundException e )  {e.printStackTrace();}
                   catch ( SQLException  e)                    {e.printStackTrace();}
	}
        }