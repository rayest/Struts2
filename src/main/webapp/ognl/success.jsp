<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <%
        request.setAttribute("name", "Ray");
        request.setAttribute("age", "18");
    %>

</head>
<body>
<%-- ognl 表达式语法 --%>
获取值栈上的值：
<s:property value="姓名"/>
<s:property value="年龄"/>
<hr/>
<%-- ognl 访问数据需要在对象前面加上 # 标志 --%>
<%-- 请求参数是在地址栏中输入请求的具体信息 http://localhost:8080/ognl?name=pee&age=21 --%>
请求参数：
<s:property value="#parameters.name"/>&nbsp;
<s:property value="#parameters.age"/><br/>

<%-- request 对象写在 jsp 中--%>
request：
<s:property value="#request.name"/>&nbsp;
<s:property value="#request.age"/><br/>

<%-- session 和 application 相应的 action 中--%>
session：
<s:property value="#session.name" />&nbsp;
<s:property value="#session.age" /><br />

application：
<s:property value="#application.name" />&nbsp;
<s:property value="#application.age" /><br />

<%-- attr 是按照取值顺序进行的：依次是 page-> request-> session-> application --%>
attr：
<s:property value="#attr.name" />&nbsp;
<s:property value="#attr.age" /><br />
<hr/>

<%-- ognl 访问 javaBean 对象：直接 ‘对象.属性’ 访问 --%>
单个 person 对象：
<s:property value="person.name" />&nbsp;
<s:property value="person.age" /><br />
<hr/>

<%-- ognl 访问 javaBean 集合对象：利用数组下标即索引访问 --%>
people 集合：
<br/>
<s:property value="peopleList[0].name" />&nbsp;
<s:property value="peopleList[0].age" /><br/>
<s:property value="peopleList[1].name" />&nbsp;
<s:property value="peopleList[1].age" /><br/>
<s:property value="peopleList[2].name" />&nbsp;
<s:property value="peopleList[2].age" /><br/>
<hr/>
<%-- ognl 访问 javaBean 的 Map 对象：利用 Map 的键属性访问 --%>
lover 集合：
<br/>
<s:property value="lovers['2010'].name" />&nbsp;
<s:property value="lovers['2010'].age" /><br />
<s:property value="lovers['2011'].name" />&nbsp;
<s:property value="lovers['2011'].age" /><br />
<s:property value="lovers['2012'].name" />&nbsp;
<s:property value="lovers['2012'].age" /><br />
<s:property value="lovers['2013'].name" />&nbsp;
<s:property value="lovers['2013'].age" /><br />
<s:property value="lovers['2014'].name" />&nbsp;
<s:property value="lovers['2014'].age" /><br />
<s:property value="lovers['2015'].name" />&nbsp;
<s:property value="lovers['2015'].age" /><br />
<s:property value="lovers['2016'].name" />&nbsp;
<s:property value="lovers['2016'].age" /><br />

<%-- 公有的静态域和静态方法的访问 --%>
静态属性：<s:property value="@cn.rayest.statics.MyStatic@STRING" /><br/>
静态方法：<s:property value="@cn.rayest.statics.MyStatic@print()" /><br/>
</body>
</html>
