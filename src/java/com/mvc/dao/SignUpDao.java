/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.bean.SignUpBean;
import com.mvc.util.*;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shraddha
 */
public class SignUpDao {

    private Connection con;

    public SignUpDao() {
        con = DBConnection.createConnection();
    }

    public String rsegisterStudent(SignUpBean signUpBean) {
        String firstName = signUpBean.getFirstName();
        String emailId = signUpBean.getEmailId();
        String password = signUpBean.getPassword();
        String address = signUpBean.getAddress();
        String city = signUpBean.getCity();
        String state = signUpBean.getState();
        String country = signUpBean.getCountry();
        int zipCode = signUpBean.getZipCode();
        String phoneNo = signUpBean.getPhoneNo();
        int confirm = signUpBean.getConfirm();
        int pendding = signUpBean.getPending();
        int rejected = signUpBean.getRejected();

        PreparedStatement preparedStatement = null;
        try {
            con = DBConnection.createConnection();
            String query = "INSERT INTO `student` (`emailID`, `password`, `fname`, `address`, `city`, `state`, `country`, `zipcode`, `phoneno`, `confirm`,`pendding`,`rejected`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
            //String query1 = "NSERT INTO `student` (`emailID`, `password`, `fname`, `address`, `city`, `state`, `country`, `zipcode`, `phoneno`, `confirm`, `pendding`, `rejected`) VALUES ('9', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', '123', '123', '0', '1', '0');"
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, emailId);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, firstName);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, city);
            preparedStatement.setString(6, state);
            preparedStatement.setString(7, country);
            preparedStatement.setInt(8, zipCode);
            preparedStatement.setString(9, phoneNo);
            preparedStatement.setInt(10, confirm);
            preparedStatement.setInt(11, pendding);
            preparedStatement.setInt(12, rejected);

            int i = preparedStatement.executeUpdate();
            preparedStatement.close();
            if (i != 0) {
                return "Success";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Oops Try Again Registration Failed";

    }

    public List<SignUpBean> getAllStudents() {
        List<SignUpBean> students = new ArrayList<SignUpBean>();
        try {
            Statement statement = con.createStatement();
            int i=1;
            ResultSet resultSet = statement.executeQuery("select * from student where pendding = "+i);
            while (resultSet.next()) {
                SignUpBean student = new SignUpBean();
                student.setStudentId(resultSet.getInt("studentId"));
                student.setEmailId(resultSet.getString("emailID"));
                student.setPassword(resultSet.getString("password"));
                student.setFirstName(resultSet.getString("fname"));
                student.setAddress(resultSet.getString("address"));
                student.setCity(resultSet.getString("city"));
                student.setState(resultSet.getString("state"));
                student.setCountry(resultSet.getString("country"));
                student.setZipCode(resultSet.getInt("zipcode"));
                student.setPhoneNo(resultSet.getString("phoneno"));
                student.setConfirm(resultSet.getInt("confirm"));
                student.setPending(resultSet.getInt("pendding"));
                student.setRejected(resultSet.getInt("rejected"));
                students.add(student);
            }
            System.out.println("com.mvc.dao.SignUpDao.getAllStudents(Working Here)");
            resultSet.close();
            statement.close();
            System.out.println("com.mvc.dao.SignUpDao.getAllStudents(Working Here)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        System.out.println("com.mvc.dao.SignUpDao.getAllStudents(Working Here)");
        return students;
    }

    public List<SignUpBean> getAllAcceptedStudents() {
        List<SignUpBean> students = new ArrayList<SignUpBean>();
        try {
            Statement statement = con.createStatement();
            int i = 1;
            ResultSet resultSet = statement.executeQuery("select * from student where confirm = " +i);
            while (resultSet.next()) {
                SignUpBean student = new SignUpBean();
                student.setStudentId(resultSet.getInt("studentId"));
                student.setEmailId(resultSet.getString("emailID"));
                student.setPassword(resultSet.getString("password"));
                student.setFirstName(resultSet.getString("fname"));
                student.setAddress(resultSet.getString("address"));
                student.setCity(resultSet.getString("city"));
                student.setState(resultSet.getString("state"));
                student.setCountry(resultSet.getString("country"));
                student.setZipCode(resultSet.getInt("zipcode"));
                student.setPhoneNo(resultSet.getString("phoneno"));
                student.setConfirm(resultSet.getInt("confirm"));
                student.setPending(resultSet.getInt("pendding"));
                student.setRejected(resultSet.getInt("rejected"));
                students.add(student);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
    public List<SignUpBean> getAllRejectedStudents() {
        List<SignUpBean> students = new ArrayList<SignUpBean>();
        try {
            Statement statement = con.createStatement();
              int i = 1;
            ResultSet resultSet = statement.executeQuery("select * from student where rejected = "+i);
            while (resultSet.next()) {
                SignUpBean student = new SignUpBean();
                student.setStudentId(resultSet.getInt("studentId"));
                student.setEmailId(resultSet.getString("emailID"));
                student.setPassword(resultSet.getString("password"));
                student.setFirstName(resultSet.getString("fname"));
                student.setAddress(resultSet.getString("address"));
                student.setCity(resultSet.getString("city"));
                student.setState(resultSet.getString("state"));
                student.setCountry(resultSet.getString("country"));
                student.setZipCode(resultSet.getInt("zipcode"));
                student.setPhoneNo(resultSet.getString("phoneno"));
                student.setConfirm(resultSet.getInt("confirm"));
                student.setPending(resultSet.getInt("pendding"));
                student.setRejected(resultSet.getInt("rejected"));
                students.add(student);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
    public List<SignUpBean> getAllPendingStudents() {
        List<SignUpBean> students = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
              int i = 1;
            ResultSet resultSet = statement.executeQuery("select * from student where pendding = "+i);
            while (resultSet.next()) {
                SignUpBean student = new SignUpBean();
                student.setStudentId(resultSet.getInt("studentId"));
                student.setEmailId(resultSet.getString("emailID"));
                student.setPassword(resultSet.getString("password"));
                student.setFirstName(resultSet.getString("fname"));
                student.setAddress(resultSet.getString("address"));
                student.setCity(resultSet.getString("city"));
                student.setState(resultSet.getString("state"));
                student.setCountry(resultSet.getString("country"));
                student.setZipCode(resultSet.getInt("zipcode"));
                student.setPhoneNo(resultSet.getString("phoneno"));
                student.setConfirm(resultSet.getInt("confirm"));
                student.setPending(resultSet.getInt("pendding"));
                student.setRejected(resultSet.getInt("rejected"));
                students.add(student);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
    
    
}
