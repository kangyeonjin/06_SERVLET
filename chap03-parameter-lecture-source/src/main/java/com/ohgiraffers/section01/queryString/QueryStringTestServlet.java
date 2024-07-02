package com.ohgiraffers.section01.queryString;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/querystring")
//url소문자로 하는것이 암묵적으로 약속
public class QueryStringTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //service로부터 전달받은 httpservletrequest는 요청시 전달한 값을 getparameter메소드로 추출할수있다.
    String name = request.getParameter("name");
    System.out.println(name);

        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println(age);

        LocalDate birthDay = LocalDate.parse(request.getParameter("birthday"));
        System.out.println(birthDay);

        String gender = request.getParameter("gender");
        System.out.println(gender);

        String national = request.getParameter("national");
        System.out.println(national);

        System.out.println("취미 : ");
        String[] hobbies = request.getParameterValues("hobbies");

        for(String hobby :hobbies){
            System.out.println(hobby);
        }
    }



}
