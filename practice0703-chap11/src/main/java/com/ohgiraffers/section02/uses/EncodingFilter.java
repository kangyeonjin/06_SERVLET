package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/*")
public class EncodingFilter implements Filter {

    public String encodingType;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType = filterConfig.getInitParameter("encoding-type");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //servletrequest를 httpservletrequest로 변환함
        HttpServletRequest hrequest = (HttpServletRequest) servletRequest;

        //요청 메서드가post인지 확인함
        if("POST".equals(hrequest.getMethod())){
            System.out.println(hrequest.getCharacterEncoding()); //요청의 문자인코딩을 출력함
            hrequest.setCharacterEncoding("UTF-8"); //문자인코딩을 utf-8로 설정함
            System.out.println(hrequest.getCharacterEncoding()); //설정된 문자 인코딩을 출력함
        }
        filterChain.doFilter(hrequest,servletResponse); //다음 필터나 서블릿을 호출함
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

}
