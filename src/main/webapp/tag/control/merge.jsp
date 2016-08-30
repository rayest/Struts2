<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="cn.rayest.student.Student" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        list1.add(new Student("张三", 10, "男"));
        list1.add(new Student("李四", 20, "女"));
        list2.add(new Student("王五", 30, "男"));
        list2.add(new Student("赵六", 40, "女"));
        request.setAttribute("list1", list1);
        request.setAttribute("list2", list2);
    %>
</head>
<body>
<%-- 打乱原有数据的顺序 --%>
<s:merge var="list3">
    <s:param value="#request.list1"></s:param>
    <s:param value="#request.list2"></s:param>
</s:merge>
<table>
    <tr>
        <th>序号</th>
        <th>性别</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <s:iterator value="list3" status="status">
        <tr>
            <td><s:property value="#status.index+1"/></td>
            <td><s:property value="sex"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="age"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>