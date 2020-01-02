package com.wilwork.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

import com.wilwork.dao.YuanDao;
import com.wilwork.dao.LoginYuanDao;
import com.wilwork.model.User;
import com.wilwork.model.Yuan;
import com.wilwork.util.DbUtil;

public class login_yuanServlet extends HttpServlet {
    DbUtil dbUtil = new DbUtil();
    YuanDao yuanDao = new YuanDao();
    LoginYuanDao loginYuanDao = new LoginYuanDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        if(userName.isEmpty() || password.isEmpty()) {
            request.setAttribute("error", "用户名或密码为空");
            request.getRequestDispatcher("test.jsp").forward(request, response);
            return;
        }
        Connection conn = null;
        try {
            User user = new User(userName, password);
            conn = dbUtil.getCon();
            User currentUser = loginYuanDao.login(conn, user);
            if(currentUser == null) {
                request.setAttribute("error", "用户名或密码错误");
                request.getRequestDispatcher("test.jsp").forward(request, response);
            } else {
                try {
                    Yuan getYuan = yuanDao.get(conn);
                    String name = getYuan.getName();
                    request.getRequestDispatcher("test.jsp").forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeCon(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

