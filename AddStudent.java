
package school;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Add")
public class AddStudent extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        StudentBean sb=new StudentBean();
        sb.setsId(req.getParameter("sid"));
        sb.setsName(req.getParameter("sn"));
        sb.setsGender(req.getParameter("sg"));
         int tm;float per;
                int i1=Integer.valueOf(req.getParameter("s1"));
                int i2=Integer.valueOf(req.getParameter("s2"));
                int i3=Integer.valueOf(req.getParameter("s3"));
                int i4=Integer.valueOf(req.getParameter("s4"));
                int i5=Integer.valueOf(req.getParameter("s5"));
                int i6=Integer.valueOf(req.getParameter("s6"));
                tm=i1+i2+i3+i4+i5+i6;
             per=tm/6;
            sb.settMarks(tm);
            sb.setper(per);
              
            int i=new AddDetailsDAO().getDetails(sb);
            if(i>0)
            {
                RequestDispatcher rd=req.getRequestDispatcher("/Add.jsp");
                rd.forward(req, res);
                
            }
            else
            {
                 RequestDispatcher rd=req.getRequestDispatcher("/Invalid.jsp");
                rd.forward(req, res);
                
            }
        
       
        }
    }

    


