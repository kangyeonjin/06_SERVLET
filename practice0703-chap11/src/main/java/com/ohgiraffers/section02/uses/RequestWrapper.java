package com.ohgiraffers.section02.uses;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper extends HttpServletRequestWrapper {

    public RequestWrapper(HttpServletRequest request){
        super(request);
    }

    @Override
    public String getParameter(String key) {

        String value ="";
        if("password".equals(key)){
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

            value = passwordEncoder.encode(super.getParameter(key));
            System.out.println(value);
        }else{
            value = super.getParameter(key);
        }

        return value;
    }
}
