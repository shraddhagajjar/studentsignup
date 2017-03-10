/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.bean.AdminLoginBean;
import com.mvc.dao.AdminLoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shraddha
 */
public class AdminLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        AdminLoginBean adminLoginBean = new AdminLoginBean();
        
        adminLoginBean.setUserName(userName);
        adminLoginBean.setPassword(password);
        System.out.println(userName);
        System.out.println(password);
        AdminLoginDao adminloginDao = new AdminLoginDao();

        String userResponse = adminloginDao.loginAdmin(adminLoginBean);
        if (userResponse.equals("Success")) {
            request.setAttribute("userName", userName);
            request.getRequestDispatcher("/Adminhome.jsp").forward(request, response);
        } else {
            request.setAttribute("errMessage", userResponse);
            request.getRequestDispatcher("/Admin.jsp").forward(request, response);
        }

    }

}
