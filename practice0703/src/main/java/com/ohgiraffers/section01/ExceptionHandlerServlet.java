package com.ohgiraffers.section01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/showerrorpage")
public class ExceptionHandlerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Enumeration<String> attrNames = request.getAttributeNames();

        while (attrNames.hasMoreElements()) {
            System.out.println(attrNames.nextElement());
        }

    }

}
