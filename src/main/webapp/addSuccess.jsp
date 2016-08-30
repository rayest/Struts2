<%@ taglib prefix="struts" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<struts:url action="initAddBook" />">添加书籍</a>
<a href="<struts:url action="listBook" />">书籍列表</a>
<a href="<struts:url action="clearBook" />">清空书籍列表</a>
<br/>
添加成功！
</body>
</html>
