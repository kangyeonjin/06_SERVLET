<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>testjsp</title>

    <style>
        h1 {
            color: #4CAF50; /* 제목의 텍스트 색상 */
            font-size: 36px; /* 제목의 폰트 크기 */
            font-family: 'Arial', sans-serif; /* 제목의 폰트 패밀리 */
            text-align: center; /* 제목을 가운데 정렬 */
            margin-top: 20px; /* 제목의 상단 여백 */
        }
        ul {
            list-style-type: none; /* 목차 항목 점 제거 */
            padding: 0;
            text-align: center; /* 목차 항목 가운데 정렬 */
        }
        li {
            display: inline-block; /* 항목을 가로로 배열 */
            margin: 0 10px; /* 항목 간 여백 */
        }
        .vertical-line {
            border-left: 2px solid #ccc; /* 세로 구분선 스타일 */
            height: 100%; /* 구분선의 높이 설정 */
            position: absolute; /* 절대 위치 설정 */
            top: 0;
            left: 50%; /* 가운데 정렬 */
            transform: translateX(-50%); /* 가운데 정렬을 위한 위치 이동 */
        }
    </style>

</head>
<body>
<h1>testjsp</h1>

<ul>
    <li><a href="jsp/1_simple.jsp">jsp 기본문법</a></li>
    <li><a href="jsp/2_simple.jsp">안녕 test</a></li>
</ul>

<hr>

<form action="/member" method="post">
    <input type="text" name="name"><br>
    <input type="submit" value="전송" style="padding: 5px 5px; background-color:cadetblue; color: white; border: none; border-radius: 4px; cursor: pointer; font-size: 16px;">
</form>

</body>
</html>