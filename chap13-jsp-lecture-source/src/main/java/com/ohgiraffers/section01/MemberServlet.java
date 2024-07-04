package com.ohgiraffers.section01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("요청오는지 확인");

        String name = request.getParameter("name");
        System.out.println(name);
        String fullName = "강" + name;
        request.setAttribute("fullName", fullName);

        Member member = new Member("홍길동", 20);
        request.setAttribute("member",member);

        HttpSession session = request.getSession();
        session.setAttribute("fullName","홍홍길동");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/testForword.jsp");
        dispatcher.forward(request,response);

    }
}
