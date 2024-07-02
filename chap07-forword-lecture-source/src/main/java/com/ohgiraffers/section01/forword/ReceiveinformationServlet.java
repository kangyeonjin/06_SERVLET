package com.ohgiraffers.section01.forword;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/forword" )
public class ReceiveinformationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        System.out.println("userId = " + userId);
        System.out.println("password = " + password);

        //로그인이 성공했다 가정
        request.setAttribute("userId", userId);

        RequestDispatcher rd = request.getRequestDispatcher("print");
        rd.forward(request,response);

    }



}
