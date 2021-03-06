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
        studentList1.add(new Student("张三", 20, "男"));
        studentList1.add(new Student("李四", 10, "女"));
        studentList1.add(new Student("王五", 40, "男"));
        studentList1.add(new Student("赵六", 30, "女"));
        request.setAttribute("studentList1", studentList1);
    %>
</head>
<body>

<table>
    <tr>
        <th>序号</th>
        <th>性别</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <%-- 截取标签：从 2 开始 start，截取两个数据 count --%>
    <s:subset source="#request.studentList1" count="2" start="2">
        <s:iterator status="status">
            <tr>
                <td><s:property value="#status.index+1"/></td>
                <td><s:property value="sex"/></td>
                <td><s:property value="name"/></td>
                <td><s:property value="age"/></td>
            </tr>
        </s:iterator>
    </s:subset>
</table>
</body>
</html>