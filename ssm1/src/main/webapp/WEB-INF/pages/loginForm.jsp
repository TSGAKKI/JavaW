<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
</head>
<body>
    <center>
        <h1 style="color:red">登录</h1>
        <font color="red">
			 <%-- 提示信息--%>
			 <span id="message">${msg}</span>
		</font>
            <form id="indexform" name="indexForm" action="login.action" method="post">
                <table border="0">
                    <tr>
                        <td>账号：</td>
                        <td><input type="text" name="usercode"></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="password" name="userpassword">
                        </td>
                    </tr>
                </table>
            <br>
                <input type="submit" value="登录" style="color:#BC8F8F">
            </form>
            <form action="register.jsp">
                <input type="submit" value="注册" style="color:#BC8F8F">
            </form>
    </center>
</body>
</html>