<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%
        request.setAttribute("name", "<font color=red>张三</font>");
    %>
</head>
<body>
<%-- 输出 ognl 表达式的值 --%>
<s:property value="#request.name"/><br/>
<%-- 如果要输出值的属性不存在，则将 default 属性值作为默认的输出结果 --%>
<s:property value="#request.name2" default="某某人"/><br/>
<%-- 如果输出结果中包含 html 格式，则通过 escapeHtml="false" 的设置将 html 格式去掉 --%>
<s:property value="#request.name" default="某某人" escapeHtml="false"/><br/>
</body>
</html>