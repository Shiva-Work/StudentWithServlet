
package school;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/PerCalServlet")
public class PercentCal extends HttpServlet {
   static  int tm=0;static float p=0;
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
         tm=Integer.valueOf(req.getParameter("s1"))+Integer.valueOf(req.getParameter("s2"))+Integer.valueOf(req.getParameter("s3"))+Integer.valueOf(req.getParameter("s4"))+Integer.valueOf(req.getParameter("s5"))+Integer.valueOf(req.getParameter("s6"));
         PrintWriter pw=res.getWriter();
         res.setContentType("text/html");
         //pw.println(tm/6f);
         RequestDispatcher rd=req.getRequestDispatcher("/Cal.jsp");
         rd.include(req, res);
        }
    public int getmarks()
    {
        return tm;
    }
    public static float getper()
    {
        return tm/6f;
    }

    

}
