<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: weiwei
  Date: 2018/12/25
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form action="adduser" method="post" modelAttribute="users">
        名字：<form:input path="name"></form:input><br/>
        年龄：<form:input path="age"></form:input><br/>
        <input type="submit" value="提交">
    </form:form>
</body>
</html>
