<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/7/16
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center;">
        <h1>我的周报</h1>
    <table border="1" bgcolor="#ff7f50">
        <tr>
            <th>序号</th>
            <th>标题</th>
            <th>内容</th>
            <th>提交时间</th>
            <th>分数</th>
            <th>操作</th>
        </tr>
        <c:forEach items="SingleStudentWeeklyList" var="weekly" varStatus="i" >
            <tr id="tr${weekly.wid}">
                <td>${i.count}</td>
                <td>${weekly.title}</td>
                <td>${weekly.context}</td>
                <c:if test="${empty weekly.score}"><td class="delBtn"><button id="${weekly.wid}">删除</button></td></c:if>
                <c:if test="${not empty weekly.score}"> <td>${weekly.score}</td></c:if>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
