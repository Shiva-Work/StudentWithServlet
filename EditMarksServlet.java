
package school;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/EditMarksServlet")
public class EditMarksServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        int k=new EditDAO().getDetails(req);
        if(k>0)
        {
            HttpSession hs = req.getSession(false);
            hs.invalidate();
            RequestDispatcher rd=req.getRequestDispatcher("Edit.jsp");
            rd.forward(req, res);
            
        }
        else
        {
            pw.println("Try Again....");
            RequestDispatcher rd=req.getRequestDispatcher("EditMarks.html");
            rd.include(req, res);
            
        }
    }


}
