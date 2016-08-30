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

<struts:form action="addBook">
    <struts:label value="添加书籍"></struts:label>
    <struts:textfield name="book.name" label="书名"/>
    <struts:textfield name="book.author" label="作者"/>
    <struts:textfield name="book.publishedDate" label="出版日期"/>
    <struts:submit value="添加"></struts:submit>
</struts:form>


</body>
</html>
