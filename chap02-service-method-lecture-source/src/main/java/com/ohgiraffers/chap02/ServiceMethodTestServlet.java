package com.ohgiraffers.chap02;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


import jakarta.servlet.annotation.WebServlet;
@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        //httpRequest의 getMethod :어떠한 http method요청인지 문자열로 반환해준다
        String httpMethod = httpRequest.getMethod();
        //a태그의 href속성은 화면url내용을 변경하는 방식으로 get요청에 해당한다
        System.out.println(httpMethod);

        if(("GET").equals(httpMethod)){
            //get요청을 처리할 메소드로 요청과 응답정보를 전달한다.
            doGet(httpRequest,httpResponse);
         //post요청을 처리할 메소드로 요청과 응답정보를 전달한다.
        }else if(("POST").equals(httpMethod)){

            doPost(httpRequest,httpResponse);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get요청을 처리할 메소드호출");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post요청을 처리할 메소드호출");

    }


}
