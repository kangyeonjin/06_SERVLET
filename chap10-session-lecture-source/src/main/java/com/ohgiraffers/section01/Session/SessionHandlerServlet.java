package com.ohgiraffers.section01.Session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("(session) firstName : "+ firstName);
        System.out.println("(session) lastName : " + lastName);

        //세션만들기
        HttpSession session = request.getSession();

        //httpsession의 기본유지시간은 30분으로 지정되어있다.
        //session유지시간 설정
        session.setMaxInactiveInterval(60*10);  //10분
        System.out.println("변경후 session유지시간 : "+ session.getMaxInactiveInterval());

        System.out.println("session id :"+session.getId());

        session.setAttribute("firstName",firstName);
        session.setAttribute("lastName",lastName);

        response.sendRedirect("redirect");
    }

}
