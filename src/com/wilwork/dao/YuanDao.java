package com.wilwork.dao;

import com.wilwork.model.User;
import com.wilwork.model.Yuan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class YuanDao {
    public Yuan get(Connection conn, Yuan yuan)throws Exception {
        Yuan resultYuan = null;
        String sql = "select * from yuan where name = ? and  sex = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, yuan.getName());
        pstmt.setBoolean(2, yuan.isSex());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            resultYuan = new Yuan();
            resultYuan.setName(rs.getString("name"));
            resultYuan.setSex(rs.getBoolean("sex"));
        }
        return resultYuan;
    }
}
