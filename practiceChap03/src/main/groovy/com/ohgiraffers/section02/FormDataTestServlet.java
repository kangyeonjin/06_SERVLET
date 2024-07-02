package com.ohgiraffers.section02;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/")
public class FormDataTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println(request.getCharacterEncoding());
        String name = request.getParameter("name");
        System.out.println(name);

        System.out.println("전달받은 데이터 조회");

        Map<String, String[]> requestMap = request.getParameterMap();
        Set<String> keySet = requestMap.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();
            String[] value = requestMap.get(key);

            System.out.println(key);
            for(int i=0; i< value.length; i++){
                System.out.println(value[i]);
            }
        }

        System.out.println("파라미터로 전달된 키 목록 확인");
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()){
            System.out.println(names.nextElement());
        }
    }

}
