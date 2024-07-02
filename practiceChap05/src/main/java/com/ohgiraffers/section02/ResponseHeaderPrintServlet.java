package com.ohgiraffers.section02;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/")
public class ResponseHeaderPrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();

        response.setHeader("Refresh","1");

        long currentTIme = System.currentTimeMillis();
        out.print("<h1>" + currentTIme + "</h1>");
        out.flush();
        out.close();

        Collection<String> responseHeaders = response.getHeaderNames();
        Iterator<String> iter = responseHeaders.iterator();

        while (iter.hasNext()){
            String headerName = iter.next();
            System.out.println(headerName+response.getHeader(headerName));
        }

    }

}
