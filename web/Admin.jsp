<%-- 
    Document   : Admin
    Created on : Jan 23, 2017, 6:28:46 PM
    Author     : shraddha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Student Sign UP ::</title>
        <style>
            .c{
                font-family:Georgia, "Times New Roman", Times, serif;
                font-size:16px;
            }
            #container{
                width:80%;
                margin:0px auto;
            }
            #header{
                top:30px;
                width:100%;
                margin:0px auto;
                margin-top:100px;
                font-family: Verdana, Arial, Helvetica, sans-serif;
                border-top-left-radius: 40px;
                border-top-right-radius: 40px;

            }

            body {
                font-size: 11.5pt;
                line-height: 1.75em;
                background-image:url(../..//css/bg.JPG);
                background-attachment:fixed;
                background-position:center;
                letter-spacing: -0.02em;
            }
            ul {
                width:100%;
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333;
            }
            #left{
                width:20%;
                margin:0px auto;
                float:left;
                height:500px;
                padding:0px;

                background-color:#9c9;
            }
            #center{
                width:100%;
                margin:0px auto;
                float:left;
                min-height: 600px;
                background:#F2F2F2;
                border-bottom-left-radius: 40px;
                border-bottom-right-radius: 40px;


            }
            li {
                float: left;

                margin: 0px auto;
            }

            li a {
                display: block;
                color: white;
                font-size:20px;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            li a:hover:not(.active) {
                background-color: #111;
            }

            .active {
                background-color: #4CAF50;
            }
            #footer {
                width:100%;
                height:100px;
                clear:both;
                top:40px;
            }
        </style>
    </head>
    <body>
    <%@include file="header.jsp" %>
    <center> <h1>Admin Login </h1>
     <form method="post" name="form1" action="AdminLoginServlet">
            <table cellspacing = "5" cellpadding = "5" class="c">
            <tr>
                <td>User Name</td>
                <td><input type="text" name="userName" /> </td>
            </tr>
            
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>
                </td>
            </tr>
            <tr>
                <td><a  href="StudentSignUp.jsp" style="color: black; text-decoration: none; font-size: 20px;" title="New Student Click Here" > SignUp!! </a></td>
                <td><input type="submit"  style="font-size: 20px;" value="Login" name="Login" /></td>
            </tr>
        </table>
        </form>
    </center>
    </center>
    </body>
</html>
