<%-- 
    Document   : AdminHeader
    Created on : Jan 24, 2017, 11:41:19 AM
    Author     : shraddha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   <body>
        
        <div id = "header" style="background-color: #F2F2F2;">
            
            <ul>
                <li><a href="StudentServlet">Home</a></li>
                <li><a href="StudentApprovedServlet">Enrolled Student</a></li>
                <li><a href="StudentPendingServlet">Waiting List</a></li>
                <li><a href="StudentRejectedServlet">Rejected List</a></li>
                <li><a href="index.jsp">Logout</a> </li>
                
            </ul>
            <h1></h1>
        </div>
        
    </body>
</html>
