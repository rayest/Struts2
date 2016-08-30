<%@ taglib prefix="struts" uri="/struts-tags" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> favoriteList = new ArrayList<String>();
    favoriteList.add("Apple");
    favoriteList.add("Banana");
    favoriteList.add("Cup");
    favoriteList.add("Dog");
    favoriteList.add("Eleven");
    request.setAttribute("favoriteList",favoriteList);
%>
<struts:form action="login">
    <struts:checkboxlist list="#request.favoriteList" name="favorite" label="favorite fruite"/>
</struts:form>
</body>
</html>
