<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>service() 메소드의 역할</h1>
<h3>Get방식의요청</h3>
<h4>a태그의 href속성값 변경</h4>
<a href="request-service">서비스요청하기</a>
<h4>form태그의 method속성을 get으로설정</h4>

<%-- form태그 : 사용자의 입력을 받을 때 사용한다--%>
<%-- action ; 입력한 데이터를 제출할때 사용할url
     method : 어떤 http 메소드를 사용할지 결정
     input태그 :다양한 형태의 입력필드생성
     submit :버튼을 누르면 서버로 입력받은 데이터 전송--%>
<form action ="request-service" method="get">
    <input type="submit" value="GET방식 요청전송">
</form>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>

<h3>post방식의요청</h3>
<h4>form태그의 method속성을 post로 설정</h4>
<form action ="request-service" method="post">
    <input type="submit" value="POST방식 요청전송">
</form>

</body>
</html>