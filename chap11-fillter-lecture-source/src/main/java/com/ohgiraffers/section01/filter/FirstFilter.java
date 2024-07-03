package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/*특정주소에만 필터를 걸고싶다면
* @webfilter("first/filter")*/

// /first로 시작하는 모든 url요청에 필터를 걸겠다
@WebFilter("/first/*")
public class FirstFilter implements Filter {

    public FirstFilter(){
        //기본생성자
        //필터는 톰캣을 start하는 시점부터 인스턴스를 미리 생성한다
        System.out.println("FirstFilter 인스턴스 생성");
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
        System.out.println("filter dofilter 호출");

        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("servlet 요청 수행 완료");

    }


}
