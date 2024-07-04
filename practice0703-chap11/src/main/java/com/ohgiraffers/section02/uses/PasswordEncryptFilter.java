package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/member/*")
public class PasswordEncryptFilter implements Filter {

    public PasswordEncryptFilter() {
        System.out.println("passwordEncryptFilter 생성");
    }



}
