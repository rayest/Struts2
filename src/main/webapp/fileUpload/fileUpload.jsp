<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:fielderror></s:fielderror>
<form action="fileUpload" method="post" enctype="multipart/form-data">
    文件：<input type="file" name="ray"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
