package com.ohgiraffers.section01.response;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;


@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

    /*서블릿이 하는 역할은 크게 3가지이다
    * 1. 요청받기 - http method get/post요청에 따라 parameter로 전달받은 데이터를 꺼낼수있다
    * 2. 비즈니스 로직처리 - db접속과 crud에 대한 로직처리 > 서비스를 호출하는 쪽으로 해결한다(mvc)
    * 3. 응답하기 - 문자열로 동적웹(html태그)페이지를 만들고 스트림을 이용해 내보낸다
    * */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //사용자 브라우저에 응답하기 위해서는 HttpServletResponse의 getWrite()method로 PrintWriter
        //인스턴스르 반환받는다
        //printwriter는 bufferwriter와 형제격인 클래스이지만 더 많은 생성자를 제공하고 있는
        //범용성으로 인해 더 많이 사용된다
        PrintWriter out = response.getWriter();

        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!DOCTYPE html>")
        .append("<html>\n")
        .append("<head>\n")
        .append("</head>\n")
        .append("<body>\n")
        .append("</h1>안녕 서블렛 response</h1>\n")
        .append("</body>\n")
        .append("</html>\n");

        //브라우저로 내보낼 데이터의 타입을 응답헤더에 설정해줘야한다
        //default type 이null이기때문에 수정 필요
        System.out.println("default response type : "+response.getContentType());

//        response.setContentType("text/html");
        response.setContentType("text/plain");

        //추가사항 : 인코딩방식변경
        response.setCharacterEncoding("UTF-8");  //브라우저에서 받은 다음에 인코딩할때 쓰는거

        //인코딩과 mime타입을 한번에 설정할수있다
//        response.setContentType("text/html; charset=UTF-8");

        out.println(responseBuilder.toString());
        out.flush(); //버퍼공간에서 내보낼떄 사용
        out.close();



    }



}
