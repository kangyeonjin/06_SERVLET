package com.ohgiraffers.section01.forword;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/print")
public class PrintLoginSuccessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId = (String) request.getAttribute("userId");
        StringBuilder responseText = new StringBuilder();
        responseText.append("<doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(userId)
                .append("님 환영합니다.</h3>\n")
                .append("</body>\n")
                .append("</html>\n");

                response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println(responseText.toString());

        out.flush();
        out.close();

        /*기본적으로 변수의 기본 스코프 메소드(=해당페이지)이기때문에 다른 페이지(=서블릿)으로
        * 데이터를 공유할수없다
        * 하지만 forword방식은 request와 response를 포함하여 위임하므로 request정보를 저장하여
        * forword하면 위임받은 서블릿에서도 위임한 서블릿의 정보를 공유할수있다
        * 이때 forword받은 서블릿의 존재를 클라이언트가 알 필요가 없기 때문에
        * url이 변경되지않는다 (결과화면만 받으면 되기때문)
        * ->forword방식의 특징이 요청시 서버로 전송한 데이터가 남아있는 상태로 새로고침(=재요청)
        * 을 하게되면 동일한 요청을 반복하여 데이터베이스에 insert하는 등의 행위가 중복될 가능성이 있다
        * -> 다른페이지 전환방식인 sendredirect를 이용한다ㅏ*/




    }

}
