package com.ohgiraffers.section03;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/")
public class Status extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendError(404, "없는 페이지 입니다. 경로를 확인하세요");
        response.sendError(500,"서버내부오류입니다.");
    }

}
