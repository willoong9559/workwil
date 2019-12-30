package com.wilwork.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

import com.wilwork.dao.UserDao;
import com.wilwork.dao.YuanDao;
import com.wilwork.model.User;
import com.wilwork.model.Yuan;
import com.wilwork.util.DbUtil;

public class loginServlet extends HttpServlet {
    DbUtil dbUtil = new DbUtil();
    UserDao userDao = new UserDao();
    YuanDao yuanDao = new YuanDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(userName);
        System.out.println(password);
        if(userName.isEmpty() || password.isEmpty()) {
            request.setAttribute("error", "用户名或密码为空");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }
        Connection conn = null;
        try {
            User user = new User(userName, password);
            conn = dbUtil.getCon();
            User currentUser = userDao.login(conn, user);
            if(currentUser == null) {
                request.setAttribute("error", "用户名或密码错误");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                //System.out.println("yes");
                //response.sendRedirect("main-html/index.jsp");
                //request.setAttribute("name", "test");
                //request.getRequestDispatcher("main-html/index.jsp").forward(request, response);
                try {
                    Yuan getYuan = yuanDao.get(conn);
                    String name = getYuan.getName();
                    Boolean sex = getYuan.isSex();
                    request.setAttribute("name", name);
                    request.getRequestDispatcher("main-html/index.jsp").forward(request, response);
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
