package com.ohgiraffers.section01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        System.out.println(name);

        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(age);

        LocalDate birthday  = LocalDate.parse(request.getParameter("birthday"));
        System.out.println(birthday);

        String gender = request.getParameter("gender");
        System.out.println(gender);

        String national = request.getParameter("national");
        System.out.println(national);

        System.out.println("취미 :");
        String[] hobbies = request.getParameterValues("hobbies");

        for(String hobby : hobbies){
            System.out.println(hobby);
        }

    }

}
