<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- 如果输入的值不符合要求，通过如下的设置可以将输入错误的原因显示出来 --%>
<s:actionerror/>
用户注册
<s:form action="/registerAction" method="POST">
    <s:textfield name="register.username" label="用户名"></s:textfield>
    <s:textfield name="register.name" label="真实姓名"></s:textfield>
    <s:textfield name="register.age" label="年龄"></s:textfield>
    <s:textfield name="register.email" label="邮件"></s:textfield>
    <s:textfield name="register.homePage" label="主页"></s:textfield>
    <s:submit value="注册"></s:submit>
</s:form>
</body>
</html>
