<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/7/16
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center;">
    <form action="" method="post">
    <h1>修改我的信息</h1>
    姓名：<input type="text" value="${Student.sname}" name="sname">
    年龄：<input type="text" value="${Student.sage}" name="sage">
    <p></p>
    <span></span>
    <a href="/提交修改信息"><button>确认修改信息！</button></a>
    </form>
</div>
</body>
</html>
