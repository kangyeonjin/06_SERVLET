package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/session")
public class SessionListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        System.out.println(session.getId());

        //session만료하게 되면 sessiondestroyed가 동작한다
        session.setMaxInactiveInterval(5);

        session.invalidate(); //세션종료

        //session에 attribute를 추가할때 attributeadded()메소드가 동작한다
        session.setAttribute("username","honggildong");
        session.setAttribute("age",20);

        session.setAttribute("user", new UserDTO("honggildong", 20));

        //session attribute에 동일한 키로 덮어쓰는 경우(수정)attributereplace메소드가 동작한다
        session.setAttribute("username", "hong");

        //session attribute를 제거할떄 attributedremoved가 동작한다
        session.removeAttribute("username");

    }


}
