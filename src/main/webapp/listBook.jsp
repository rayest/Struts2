<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="struts" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<a href="<struts:url action="initAddBook" />">添加书籍</a>
<a href="<struts:url action="listBook" />">书籍列表</a>
<a href="<struts:url action="clearBook" />">清空书籍列表</a>

<struts:property value="title" />

<table>
    <tr>
        <th>书名</th>
        <th>作者</th>
        <th>出版日期</th>
    </tr>

    <struts:iterator value="bookList">
    <tr>
        <td>${ book.name }</td>
        <td>${ book.author }</td>
        <td>${ book.publishedDate }</td>
    </tr>
    </struts:iterator>

</table>
</body>
</html>
