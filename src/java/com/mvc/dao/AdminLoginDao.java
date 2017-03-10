/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.bean.AdminLoginBean;
import com.mvc.util.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author shraddha
 */
public class AdminLoginDao {
     public String loginAdmin(AdminLoginBean adminLoginBean) {
        String userName = adminLoginBean.getUserName();
        String password = adminLoginBean.getPassword();
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String userNameDB = "";
        String passwordDB = "";

        try {
            con = DBConnection.createConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select * from `admin`");
            while (resultSet.next()) {
                userNameDB = resultSet.getString("username"); 
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
