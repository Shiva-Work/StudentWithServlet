<%-- 
    Document   : View
    Created on : 21-Oct-2022, 11:09:38 pm
    Author     : Shiva
--%>

<%@page import="school.*"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<StudentBean> al=(ArrayList<StudentBean>)request.getAttribute("list");
            Iterator<StudentBean> it = al.iterator();
                 while(it.hasNext())
                  {
                       StudentBean pb = (StudentBean)it.next();
                       out.println(pb.getsId()+"&nbsp&nbsp"+pb.getsName()+"&nbsp&nbsp"+pb.getsGender()+"&nbsp&nbsp"+pb.gettMarks()+"&nbsp&nbsp"+pb.getper() +"<br>");
        }
            
            %>
            <button onclick="history.back()">Go Back</button>
    </body>
</html>
