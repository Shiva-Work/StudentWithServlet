<%-- 
    Document   : Cal
    Created on : 22-Oct-2022, 3:25:51 am
    Author     : Shiva
--%>
<%@page import="school.PercentCal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        float p=PercentCal.getper();
        out.println("Percentage = "+p);
        %>
    </body>
</html>
