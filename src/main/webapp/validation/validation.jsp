<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/22 0022
  Time: 上午 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
简单自定义验证
<s:form action="/validationAction" method="POST">
    <s:textfield name="name" label="姓名"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
