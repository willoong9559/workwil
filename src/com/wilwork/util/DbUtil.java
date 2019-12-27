package com.wilwork.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

    private String dbUrl = "jdbc:mysql://localhost:3306/db_jsp";
    private String dbUserName = "root";
    private String dbPassword = "lwl1472583690";
    private String jdbcName = "com.mysql.cj.jdbc.Driver";

    public Connection getCon()throws Exception {
        Class.forName(jdbcName);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_jsp", "root", "lwl1472583690");
        System.out.println("数据库连接成功");
        return conn;
    }

    public void closeCon(Connection con)throws Exception{
        if(con != null) {
            con.close();
        }
    }

    public static void main(String[] args) throws Exception {
        DbUtil dbUtil = new DbUtil();
        try {
            dbUtil.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
