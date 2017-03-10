<%-- 
    Document   : RejectedList
    Created on : Jan 24, 2017, 11:48:17 AM
    Author     : shraddha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: Admin Panel ::</title>
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
        <%@include file="AdminHeader.jsp" %>
    <center> 

        Welcome <%=(request.getAttribute("userName") == null) ? "" : request.getAttribute("userName")%> !!
        <h1>Rejected Student's Application </h1>


        <table border="1" cellpadding="5" cellspacing="5">
            <tr>
                <th>Student ID</th>
                <th>Student Name</th>
                <th>Email ID</th>
                <th>Address</th>
                <th>City</th>
                <th>State</th>
                <th>County </th>
                <th>Zip code</th>
                <th>Phone No</th>


            </tr>

            <c:forEach var="student" items="${studentList}">
                <tr>
                    <td>${student.studentId}</td>
                    <td>${student.firstName}</td>
                    <td>${student.emailId}</td>
                    <td>${student.address}</td>
                    <td>${student.city}</td>
                    <td>${student.state}</td>
                    <td>${student.country}</td>
                    <td>${student.zipCode}</td>

                    <td>${student.phoneNo}</td>
                </tr>
            </c:forEach>
        </table>


    </center>

</center>

</body>
</html>
