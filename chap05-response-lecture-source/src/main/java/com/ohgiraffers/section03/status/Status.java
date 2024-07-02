package com.ohgiraffers.section03.status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/status")
public class Status extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //200,400,401,404,500
        response.sendError(404,"없는 페이지입니다. 경로를 확인해주세요");
        response.sendError(200,"요청이 성공적으로 되었습니다.");
        response.sendError(400,"잘못된 문법으로 서버가 인식할수없습니다.");
        response.sendError(401,"클라이언트 인증오류");
        response.sendError(500,"서버내부오류입니다. 서버오류는 개발자 오류입니다.");

    }

}
