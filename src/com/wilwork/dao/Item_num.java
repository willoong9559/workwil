package com.wilwork.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Item_num {
    public int get(Connection conn)throws Exception {
        int num = 0;
        Statement statement = conn.createStatement();
        String sql = "select * from yuan";
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            num = rs.getInt("id");
        }
        rs.close();
        return num;
    }
}
