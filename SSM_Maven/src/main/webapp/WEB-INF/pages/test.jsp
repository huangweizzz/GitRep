<%--
  Created by IntelliJ IDEA.
  User: Ego
  Date: 2020/12/3
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有的账户</h3>
<c:forEach items="${list}" var="account">
    ${account}
</c:forEach>
</body>
</html>
