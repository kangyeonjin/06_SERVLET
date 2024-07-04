package com.ohgiraffers.section01.contextlistener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/context")
public class ContextListenerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("listener확인용");

        ServletContext context = request.getServletContext();
        //context에 attribute 를 추가하게되면 attributeAdded메소드가 동작한다
        context.setAttribute("test","value");

        //동일한 key를 context에 attribute를 추가하면 attributereplaced메소드가 동작한다
        context.setAttribute("test","value2");

        //context에서 attribute를 제거하면 attributeremoned()메소드가 동작한다
        context.removeAttribute("test");

    }


}
