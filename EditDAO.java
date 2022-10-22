
package school;

import java.sql.*;
import javax.servlet.http.*;
public class EditDAO {
    
   public int getDetails(HttpServletRequest req)
   {
       int i=0;
       int newMarks=Integer.valueOf(req.getParameter("s1"))+Integer.valueOf(req.getParameter("s2"))+Integer.valueOf(req.getParameter("s3"))+Integer.valueOf(req.getParameter("s4"))+Integer.valueOf(req.getParameter("s5"))+Integer.valueOf(req.getParameter("s6"));
        float newPer=newMarks/6;
       try
       {
           Connection con=DBConnection.getCon();
            PreparedStatement ps=con.prepareStatement("update student set Total_Marks=?,Percentage=? where Student_ID=?");
            HttpSession hs=req.getSession(false);
            if(hs!=null)
            {
                ps.setInt(1, newMarks);
                ps.setFloat(2, newPer);
                ps.setString(3, (String) hs.getAttribute("iName"));
                 i=ps.executeUpdate();
            }
                
            
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return i;
   }
    
    
}
