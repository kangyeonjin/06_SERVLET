package com.ohgiraffers.section02.otherservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("이 서블릿으로 redirect 성공");

        StringBuilder redirectTest = new StringBuilder();
        redirectTest.append("<!doctype html\n>")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>이 서블릿으로 redirect성공</h1>\n")
                .append("</body>\n")
                .append("</html>\n");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(redirectTest.toString());

        out.flush();
        out.close();

        /*redirect하면 url이 재작성되어 새로고침할때 redirect된 페이ㅓ지에 대한 요청을 반복한다.
        * 즉,이전요청에 포함된 정보는 남이있지 않고 url이 변경되는것이 redirect의 특징 따라서
        * 첫요청시의 request와 현재 redirect된 페이지의 request는 서로다른 객체어ㅣ므로
        * redirect를 쓰면 이전 서블릿의 값을 공유해서 사용할수없디/*/

    }


}
