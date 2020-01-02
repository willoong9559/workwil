package com.wilwork.dao;

import com.wilwork.model.User;
import com.wilwork.model.Yuan;

import java.sql.*;

public class YuanDao {
    public Yuan get(Connection conn)throws Exception {
        Yuan yuan = new Yuan();
        Statement statement = conn.createStatement();  //用statement 来执行sql语句
        String sql = "select * from yuan";   //这是sql语句中的查询某个表，注意后面的emp是表名！！！
        ResultSet rs = statement.executeQuery(sql);  //用于返回结果
        while(rs.next()){
            yuan.setName(rs.getString("name"));
            yuan.setSex(rs.getBoolean("sex"));
        }
        rs.close();
        return yuan;
    }

    public void insert(Connection conn, String name, int sex, int status)throws Exception {
        PreparedStatement psql = conn.prepareStatement("insert into yuan (name, sex, status)"+"values(?,?,?)");  //用preparedStatement预处理来执行sql语句
        //给其五个参量分别“赋值”
        psql.setString(1, name);
        psql.setInt(2, sex);
        psql.setInt(3, status);
        //DateFormat mydateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Date mydate = mydateFormat.parse("2014-01-01");
        psql.executeUpdate();  //参数准备后执行语句
        psql.close();
    }
}
