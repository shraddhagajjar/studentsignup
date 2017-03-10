/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;


import com.mvc.bean.LoginBean;
import com.mvc.util.*;
import java.sql.*;

/**
 *
 * @author shraddha
 */
public class LoginDao {

    public String loginUser(LoginBean loginBean) {
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB = "";

        try {
            con = DBConnection.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select emailID,password from student");
            while (resultSet.next()) {
                userNameDB = resultSet.getString("emailID"); //fetch the values present in database
                passwordDB = resultSet.getString("password");
                if (userName.equals(userNameDB) && password.equals(passwordDB)) {
                    return "Success";
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Invalid user credentials";
    }

}
