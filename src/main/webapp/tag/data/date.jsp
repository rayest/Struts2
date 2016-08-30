<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%-- 向请求中设置日期属性 --%>
    <%
        request.setAttribute("date", new Date());
    %>
</head>
<body>
<%-- 获取请求中日期属性值：方式 1 --%>
${date }<br/>
<%-- 获取请求中日期属性值：方式 1 --%>
当前日期：<s:date name="#request.date" format="yyyy-MM-dd"/>
</body>
</html>