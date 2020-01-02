package com.wilwork.dao;

import com.wilwork.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginYuanDao {
    public  User login(Connection conn, User user)throws Exception {
        User resultUser = null;
        String sql = "select * from y_user where userName = ? and password = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUserName());
        pstmt.setString(2, user.getPassword());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            resultUser = new User();
            resultUser.setUserName(rs.getString("userName"));
            resultUser.setPassword(rs.getString("password"));
        }
        return resultUser;
    }

    public void insert(Connection conn, String userName, String password)throws Exception {
        PreparedStatement psql = conn.prepareStatement("insert into yuan (userName, password)"+"values(?,?)");  //用preparedStatement预处理来执行sql语句
        //给参量分别“赋值”
        psql.setString(1, userName);
        psql.setString(2, password);
        psql.executeUpdate();
        psql.close();
    }

}
