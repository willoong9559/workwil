package com.wilwork.web;

import com.wilwork.dao.LoginYuanDao;
import com.wilwork.dao.YuanDao;
import com.wilwork.random.RandomStr;
import com.wilwork.util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class qianServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("main-html/basic-table.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection conn = null;
        YuanDao yuan = new YuanDao();
        DbUtil dbUtil = new DbUtil();
        LoginYuanDao loginYuanDao = new LoginYuanDao();

        try {
            conn = dbUtil.getCon();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String name = new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8");//中文乱码
        String sex = new String(request.getParameter("sex").getBytes("iso-8859-1"), "utf-8");
        RandomStr randomStr = new RandomStr();
        String userName = randomStr.getRandomString(6);
        String password = randomStr.getRandomString(6);
        request.setAttribute("name", "生成账号:" + userName + "密码:" + password);
        request.getRequestDispatcher("main-html/basic-table.jsp").forward(request, response);
        try {
            loginYuanDao.insert(conn, userName, password);
            System.out.println("插入成功2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(name);
        int Tsex = 0;
        if(sex == "男"){
            Tsex = 1;
        }
        try {
            yuan.insert(conn, name, Tsex, 1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("插入成功");
        }
    }
}
