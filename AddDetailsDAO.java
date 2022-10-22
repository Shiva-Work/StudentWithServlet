
package school;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AddDetailsDAO {
    public int k;
   public int getDetails(StudentBean sb)
   {
       
        
        try
        {
            Connection con=DBConnection.getCon();
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
            ps.setString(1, sb.getsId());
            ps.setString(2, sb.getsName());
            ps.setString(3, sb.getsGender());
            ps.setInt(4, sb.gettMarks());
            ps.setFloat(5, sb.getper());
             k=ps.executeUpdate();
            
           
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return k;
   }
    
    
    
}
