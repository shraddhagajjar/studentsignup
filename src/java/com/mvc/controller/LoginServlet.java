/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shraddha
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    public LoginServlet(){
    
}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        LoginBean loginBean = new LoginBean();
        loginBean.setUserName(userName);
        loginBean.setPassword(password);
        System.out.println(userName);
        System.out.println(password);
        LoginDao loginDao = new LoginDao();
        
        String userResponse = loginDao.loginUser(loginBean);
        if(userResponse.equals("Success")){
            request.setAttribute("userName", userName);
            request.getRequestDispatcher("/StudentHome.jsp").forward(request, response);
        }
        else{
            request.setAttribute("errMessage", userResponse); 
            request.getRequestDispatcher("/Student.jsp").forward(request, response);
        }
               

    }


}
