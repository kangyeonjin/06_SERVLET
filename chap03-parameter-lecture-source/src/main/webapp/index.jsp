<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Parameter</title>
</head>
<body>
<h1>Request Parameter</h1>
<h3>GET방식의 요청</h3>
<h4>form 태그를 이용한 get방식 요청</h4>
<form action ="querystring" method="post">
    <label>이름 :</label> <input type="text" name="name">
    <br>
    <label>나이 :</label> <input type="number" name="age">
    <br>
    <label>생일 :</label> <input type="date" name="birthday">
    <br>
    <label>성별 :</label>
    <input type="radio" name="gender" id="male" value="M"><label for ="male">남자</label>
    <input type="radio" name="gender" id="female" value="F"><label for ="female">여자</label>
    <br>
    <label>국적 :</label>
    <select name="national">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select><br>

    <label> 취미 :</label>
    <input type ="checkbox" name="hobbies" id="movie" value="movie"><label for="movie">영화</label>
    <input type ="checkbox" name="hobbies" id="music" value="music"><label for="music">음악</label>
    <input type ="checkbox" name="hobbies" id="sleep" value="sleep"><label for="sleep">취침</label>
    <br>

    <input type="submit" value="GET 요청">
</form>
<h4>a태그의 href속성에 파라미터를 쿼리스트링형태로 작성하여 get방식 요청</h4>
<a href ="http://localhost:8080/querystring?name=%EA%B0%95%EC%97%B0%EC%A7%84&age=39&birthday=1988-01-01&gender=F&national=ko&hobbies=movie">
   쿼리스트링을 이용한 값전달
</a>

<h3>post방식의 요청</h3>
<h4>form 태그를 이용한 post방식 요청</h4>
<form action ="formdata" method="post">
    <label>이름 :</label> <input type="text" name="name">
    <br>
    <label>나이 :</label> <input type="number" name="age">
    <br>
    <label>생일 :</label> <input type="date" name="birthday">
    <br>
    <label>성별 :</label>
    <input type="radio" name="gender" id="male2" value="M"><label for ="male2">남자</label>
    <input type="radio" name="gender" id="female2" value="F"><label for ="female2">여자</label>
    <br>
    <label>국적 :</label>
    <select name="national">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select><br>

    <label> 취미 :</label>
    <input type ="checkbox" name="hobbies" id="movie2" value="movie"><label for="movie2">영화</label>
    <input type ="checkbox" name="hobbies" id="music2" value="music"><label for="music2">음악</label>
    <input type ="checkbox" name="hobbies" id="sleep2" value="sleep"><label for="sleep2">취침</label>
    <br>

    <input type="submit" value="post 요청">
</form>
</body>
</html>