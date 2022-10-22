
package school;
import java.sql.*;
import java.util.*;
public class ViewDAO {
     public ArrayList<StudentBean> al = new ArrayList<StudentBean>();
    public ArrayList<StudentBean> getView()
    {
       try
       {
           Connection con=DBConnection.getCon();
       PreparedStatement ps=con.prepareStatement("select * from student");
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
           StudentBean sb=new StudentBean();
           sb.setsId(rs.getString(1));
           sb.setsName(rs.getString(2));
           sb.setsGender(rs.getString(3));
           sb.settMarks(rs.getInt(4));
           sb.setper(rs.getFloat(5));
           al.add(sb);
       }
       }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return al;
    }
    
}
