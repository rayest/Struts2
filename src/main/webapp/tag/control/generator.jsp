<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 分隔号 --%>
<s:generator separator="," val="'张三, 李四, 王五'" var="nameList"></s:generator>

<s:iterator value="#nameList">
	<s:property/>
</s:iterator>
</table>
</body>
</html>