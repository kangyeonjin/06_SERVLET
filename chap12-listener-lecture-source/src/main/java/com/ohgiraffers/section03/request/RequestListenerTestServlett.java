package com.ohgiraffers.section03.request;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/")
public class RequestListenerTestServlett extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //request에 attribute를 추가할때
        request.setAttribute("username", "hongildong");
        request.setAttribute("age", 20);
        request.setAttribute("gendeer", "M");

        //request에 attribute동일한 key로 덮어쓰는경우
        //attributedreplaced메소드가 동작한다
        request.setAttribute("username","hong");

        //request에 attribute를 제거할때 attributeremoved가 동작한다
        request.removeAttribute("gender");

    }


}
