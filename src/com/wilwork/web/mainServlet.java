package com.wilwork.web;

import com.wilwork.dao.YuanDao;
import com.wilwork.model.Yuan;
import com.wilwork.util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class mainServlet extends HttpServlet {

    DbUtil dbUtil = new DbUtil();
    YuanDao yuanDao = new YuanDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //this.doPost(request, response);
        Connection conn = null;
        try {
            Yuan yuan = new Yuan();
            conn = dbUtil.getCon();
            Yuan getYuan = yuanDao.get(conn, yuan);
            String name = getYuan.getName();
            Boolean sex = getYuan.isSex();
            request.setAttribute("name", name);
            request.getRequestDispatcher("main-html/index.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
