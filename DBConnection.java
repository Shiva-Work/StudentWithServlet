
package school;
import java.sql.*;
public class DBConnection {
    private static Connection con=null;
    private DBConnection (){}
    static{
        try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/db1","root","1234");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}
    public static Connection getCon()
    {
        return con;
    }
    
    
    
}
