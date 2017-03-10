/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.dao.SignUpDao;
import com.mvc.bean.SignUpBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shraddha
 */
public class StudentServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
        
    public StudentServlet() {
            super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       
        SignUpDao dao = new SignUpDao();
        List<SignUpBean> list = dao.getAllStudents();
        request.setAttribute("studentList", list);
        RequestDispatcher view = request.getRequestDispatcher("Adminhome.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
