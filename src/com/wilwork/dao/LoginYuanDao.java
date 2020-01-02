package com.wilwork.dao;

import com.wilwork.model.User;
import com.wilwork.model.Yuan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginYuanDao {
    public Yuan get(Connection conn)throws Exception {
        Yuan yuan = new Yuan();
        Statement statement = conn.createStatement();  //用statement 来执行sql语句
        String sql = "select * from y_user";   //这是sql语句中的查询某个表，注意后面的emp是表名！！！
        ResultSet rs = statement.executeQuery(sql);  //用于返回结果
        while(rs.next()){
            yuan.setName(rs.getString("name"));
            yuan.setSex(rs.getBoolean("sex"));
        }
        rs.close();
        return yuan;
    }

    public void insert(Connection conn, String userName, String password)throws Exception {
        PreparedStatement psql = conn.prepareStatement("insert into y_user (userName, password)"+"values(?,?)");  //用preparedStatement预处理来执行sql语句
        //给参量分别“赋值”
        //psql.setInt(1, id);
        psql.setString(1, userName);
        psql.setString(2, password);
        psql.executeUpdate();
        psql.close();
    }

}
