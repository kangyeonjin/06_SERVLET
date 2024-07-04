<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%!private String name;
   private int age; %>

<%
    name ="홍길동";
    age =20;
    System.out.println(name);
    System.out.println(age);

    for(int i =0; i<name.length();i++){
        System.out.println(name.charAt(i));
    }
%>

<%--expresson태그--%>

name : <%= name %>
age : <%= age %>

</body>
</html>
