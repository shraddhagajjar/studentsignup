<%-- 
    Document   : StudentHome
    Created on : Jan 23, 2017, 8:43:02 PM
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
        <h1>! Student Home !</h1>
        <%=(request.getAttribute("userName") == null) ? "" : request.getAttribute("userName")%>
        <%=(request.getAttribute("message") == null) ? "" : request.getAttribute("message")%>
        
        <h1><a href="index.jsp" title="Click here to go back">Go Back To Home Page</a></h1>
    </body>
</html>
