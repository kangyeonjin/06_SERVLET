<%--
  Created by IntelliJ IDEA.
  User: 80402
  Date: 2024-07-04
  Time: 오후 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
</head>

<body>

<h1><%=request.getAttribute("fullName")%>님 환영합니다</h1>
<h2>1. ${name}</h2>
<h2>1. ${param.name}</h2>
<h2>1. ${fullName}</h2>
<h2>2. ${member}</h2>

</body>
</html>
