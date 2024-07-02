package com.ohgiraffers.section01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.function.DoubleToIntFunction;

import jakarta.servlet.annotation.WebServlet;

import static java.lang.System.out;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!doctype html>")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>안녕서블렛 response</h1>\n")
                .append("</body>\n")
                .append("<html>\n");

        out.println(response.getContentType());
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        out.println(responseBuilder.toString());
        out.flush();
        out.close();

    }

}
