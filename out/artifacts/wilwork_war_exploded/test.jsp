<%--
  Created by IntelliJ IDEA.
  User: willoong
  Date: 2019/12/23
  Time: 4:41 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8" />
    <title>登录</title>
    <link rel="stylesheet" href="css/login_yuan.css" />
</head>

<body>
<form action="y_login" method="post">
    <div class="top">员工考勤系统</div>
    <div class="content">
        <div class="login">
            <div class="title">员工登录</div>
            <div class="line">
                <img class="smallImg" src="img/icon1.png" />
                <input placeholder="请输入账号" type="text" name="username" />
            </div>
            <div class="line">
                <img class="smallImg" src="img/icon2.png" />
                <input placeholder="请输入密码" type="password" name="password"/>
            </div>
            <button type="submit" class="logBut">员工登录</button>
            <h1 style="color: red">${error }</h1>
        </div>
    </div>
    <div class="power">Powered by 李伟龙</div>
</form>
</body>
</html>
