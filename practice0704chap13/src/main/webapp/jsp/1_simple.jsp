<%--
  Created by IntelliJ IDEA.
  User: 80402
  Date: 2024-07-04
  Time: 오전 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%!private String name;
private int age;%>

<%
    name = "홍길동";
    age = 20;

    System.out.println(name);
    System.out.println(age);

    for(int i=0; i <name.length();i++){
        System.out.println(name.charAt(i));
    }

%>

name : <%= name %>
age : <%= age %>

<li><a href="jsp/3_simple.jsp">안녕 test</a></li>

</body>
</html>
