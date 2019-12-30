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

        Connection conn = null;
        try {
            conn = dbUtil.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Yuan getYuan = null;
        try {
            getYuan = yuanDao.get(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String name = getYuan.getName();
        Boolean sex = getYuan.isSex();
        request.setAttribute("name", name);
        request.getRequestDispatcher("main-html/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
