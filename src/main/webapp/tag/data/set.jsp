<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%-- 设置变量 i 的值是 1 --%>
<s:set var="i" value="1"></s:set>
<%-- 输出变量 i 的值 --%>
<s:property value="#i"/><br/>

<%-- 声明 5 个不同作用范围的变量，并赋值为其相应的值 --%>
<s:set var="a" value="'action范围的值'" scope="action"></s:set>
<s:set var="p" value="'page范围的值'" scope="page"></s:set>
<s:set var="r" value="'request范围的值'" scope="request"></s:set>
<s:set var="s" value="'session范围的值'" scope="session"></s:set>
<s:set var="app" value="'application范围的值'" scope="application"></s:set>
<%-- 输出 5 个变量的值，不同的变量有不同的输出方式 --%>
<s:property value="#a"/><br/>
<s:property value="#attr.p"/><br/>
<s:property value="#request.r"/><br/>
<s:property value="#session.s"/><br/>
<s:property value="#application.app"/><br/>
</body>
</html>