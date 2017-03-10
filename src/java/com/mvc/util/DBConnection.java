/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.util;
import java.sql.Connection;
 import java.sql.DriverManager;
/**
 *
 * @author shraddha
 */
public class DBConnection {

    public static Connection createConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost/student_information";
        String username = "root"; 
        String password = ""; 

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");// differs from DB server to server
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}

