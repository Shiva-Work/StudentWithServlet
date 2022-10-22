
package school;
import java.sql.*;
import javax.servlet.http.*;
public class CheckIdDAO {
    public String getId(HttpServletRequest req)
    {
        String iD = null;
        try
        {
            Connection con=DBConnection.getCon();
            PreparedStatement ps=con.prepareStatement("select * from student where Student_ID=?");
            ps.setString(1, req.getParameter("id"));
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                iD=req.getParameter("id");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return iD;
    }
    
}
