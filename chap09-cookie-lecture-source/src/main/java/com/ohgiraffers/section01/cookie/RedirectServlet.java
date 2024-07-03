package com.ohgiraffers.section01.cookie;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("(redirect) firstName : "+ firstName);
        System.out.println("(redirect) lastName : " + lastName);

        /*
        * 쿠키사용하기
        * 1. request에서 쿠키목록을 쿠키배열 형태로 꺼내온다
        * 2. 쿠키의 getName과 getValue를 이용해 쿠키에 담김 값을 사용한다*/

        Cookie[] cookies =request.getCookies();
        for(int i =0; i < cookies.length;i++){
            System.out.println(cookies[i].getName()+cookies[i].getValue());

            if("firstName".equals(cookies[i].getName())){
                firstName = cookies[i].getValue();
            } else if ("lastName".equals(cookies[i].getName())) {
                lastName = cookies[i].getValue();
            }
        }

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3>your first name is>")
                .append(firstName)
                .append("and last name is>")
                .append(lastName)
                .append("</h3>\n")
                .append("</body>\n")
                .append("</html>\n");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(responseText.toString());

        out.flush();
        out.close();

        /*쿠키는 텍스트 파일 형태로 클라이언트 컴퓨터에 저장된다
        * 개인pc는 상관없지만 공용pc등 다른 사용자와 함께 쓰는 컴퓨터이면
        * (민감한 개인정보를 포함할경우) 보안에 취약하다
        * 따라서 민감한 개인정보를 취급하는경우에는 쿠키보다는 세션을 사용한다
        * 세션을 쿠키와 유사한 형태로 key=value쌍으로 저장되지만
        * 서버(톰켓)에서 관리되므로 보안에 더 우수하다는 장점을 가진다*/
    }

}
