<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/7/16
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>


</head>
<body>
<div style="text-align: center;">
<h1>我的信息</h1>
    姓名：${Student.sname}
    年龄：${Student.sage}
    班级：${student.cid}班
    <p></p>
    <span></span>
    <a href="/updateSingleStudent"><button>修改个人信息！</button></a>
</div>
</body>
</html>
