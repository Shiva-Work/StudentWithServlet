package school;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/check")
public class CheckServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String id=new CheckIdDAO().getId(req);
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        if(id==null)
        {
            pw.println("Not Success...");
        }
        else
        {
            HttpSession hs=req.getSession();
                    hs.setAttribute("iName", id);
             RequestDispatcher rd=req.getRequestDispatcher("/EditMarks.html");
             rd.include(req, res);
           
        }
    }
    }

    