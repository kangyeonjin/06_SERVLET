package com.ohgiraffers.section01.Filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebFilter("/first/*")
public class FirstFilter implements Filter {

    public FirstFilter() {
        System.out.println("firstfiler 인스턴스생성");

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init 호출");
    }

    @Override
    public void destroy() {
        System.out.println("filter destroy호출");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter dofilter호출");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("servlet요청 수행 완료");

    }

}
