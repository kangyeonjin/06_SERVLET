<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>service()메소드 역할</h1>
<h3>get방식의 요청</h3>
<h3>a태그의 href속성값변경</h3>
<a href ="request-service">서비스 메소드 요청하기</a>
<h4>form태그의 method속성을 get으로 설정</h4>

<form action="requesst-service" method="post">
    <input type="submit" value="POST방식 요청전송">
</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>