package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/member/regist")
public class RegistMemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        System.out.println(userId);
        System.out.println(password);
        System.out.println(name);

        BCryptPasswordEncoder passwordEncoder = new BcryptPasswordEncoder();
        System.out.println(passwordEncoder.matches("pass01",password));

    }
}
