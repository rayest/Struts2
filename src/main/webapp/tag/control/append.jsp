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
        List studentList1 = new ArrayList();
        List studentList2 = new ArrayList();
        studentList1.add(new Student("张三", 10, "男"));
        studentList1.add(new Student("李四", 20, "女"));
        studentList2.add(new Student("王五", 30, "男"));
        studentList2.add(new Student("赵六", 40, "女"));
        request.setAttribute("studentList1", studentList1);
        request.setAttribute("studentList2", studentList2);
    %>
</head>
<body>
<%-- 数据追加 --%>
<s:append var="studentList3">
    <s:param value="#request.studentList1"></s:param>
    <s:param value="#request.studentList2"></s:param>
</s:append>
<table>
    <tr>
        <th>序号</th>
        <th>性别</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <s:iterator value="studentList3" status="status">
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