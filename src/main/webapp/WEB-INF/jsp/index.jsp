<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>后台管理系统</title>
    <link href="/images/admin/admin_index.png" rel="shortcut icon" type='image/x-icon' />
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet" />
    <!-- js引入 -->
    <script src="/js/jquery.js"></script>
    <script src="/js/bootstrap/bootstrap.min.js"></script>
</head>
<frameset rows="100%, *" frameborder="0">
    <frameset cols="15%, *" frameborder="0">
        <frame src="/home" name="left" noresize="noresize" />
        <frameset rows="100%, *">
            <frame src="/WEB-INF/jsp/right.jsp" name="right" noresize="noresize" />
        </frameset>
    </frameset>
</frameset>

</html>