/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import java.io.IOException;
import com.mvc.bean.SignUpBean;
import com.mvc.dao.SignUpDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shraddha
 */
public class SignUp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String emailId = request.getParameter("emailID");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        int zipCode = Integer.parseInt(request.getParameter("zipCode"));
        String phoneNo = request.getParameter("phoneNo");
        
        SignUpBean signUpBean = new SignUpBean();
        signUpBean.setFirstName(firstName);
        signUpBean.setEmailId(emailId);
        signUpBean.setPassword(password);
        signUpBean.setAddress(address);
        signUpBean.setCity(city);
        signUpBean.setState(state);
        signUpBean.setCountry(country);
        signUpBean.setPhoneNo(phoneNo);
        signUpBean.setZipCode(zipCode);
        int i=1;
        signUpBean.setPending(i);
        int j = 0;
        signUpBean.setRejected(j);
        signUpBean.setConfirm(j);
        SignUpDao signUpDao = new SignUpDao();
        String registerStudent = signUpDao.rsegisterStudent(signUpBean);
        if(registerStudent.equals("Success")){
            String message =  " Registration is successfully wait to get confirmation in email Thank you!!";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/StudentHome.jsp").forward(request, response);
        }
        else{
            request.setAttribute("errMessage", registerStudent); 
            request.getRequestDispatcher("/StudentSignUp.jsp").forward(request, response);
        }
        
       
        
    }

}
