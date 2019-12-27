package com.wilwork.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//ClassNotFoundException

public class dbTest {
    public static void main(String []args) throws Exception {
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/db_jsp", "root", "lwl1472583690");
                            System.out.println("连接成功");
        } catch (SQLException ex) {
            // handle any errors
        }
    }

}