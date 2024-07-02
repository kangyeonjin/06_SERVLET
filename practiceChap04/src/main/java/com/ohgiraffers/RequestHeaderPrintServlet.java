package com.ohgiraffers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/hearders")
public class RequestHeaderPrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            System.out.println(headerNames.nextElement());
        }

        System.out.println(request.getHeader("accept"));
        System.out.println(request.getHeader("accept-encoding"));
        System.out.println(request.getHeader("accept-language"));
        System.out.println(request.getHeader("connection"));
        System.out.println(request.getHeader("host"));
        System.out.println(request.getHeader("referer"));
        System.out.println(request.getHeader("sec-fetch-dest"));
        System.out.println(request.getHeader("sec-fetch-mode"));
        System.out.println(request.getHeader("sec-fetch-site"));
        System.out.println(request.getHeader("sec-fetch-user"));
        System.out.println(request.getHeader("cache-control"));
        System.out.println(request.getHeader("upgrade-insecure-requests"));
        System.out.println(request.getHeader("user-agent"));

    }


}
