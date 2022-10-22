
package school;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;
@WebServlet("/View")
public class ViewServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
      res.setContentType("text/html");
        ArrayList<StudentBean> al=new ViewDAO().getView();
        if(al.size()==0) {
                  pw.println("Products Not Available...<br>");
  }else {
            req.setAttribute("list", al);
  RequestDispatcher rd=req.getRequestDispatcher("View.jsp");
                  rd.forward(req, res);
        }
    }

    
}
