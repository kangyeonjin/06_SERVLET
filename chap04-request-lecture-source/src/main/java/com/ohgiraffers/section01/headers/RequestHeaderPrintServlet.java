package com.ohgiraffers.section01.headers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/headers")

/*
* 헤더의 종류 4가지
* 1.general header
* 요청및 응답 모두에 적용되지만 최종적으로는 body에 전송되는것과 관련이 없는 헤더
* body : 클라이언트가 요청을 보낼때post에 어떤 특정값을 담는 공간
* 2.request header
* fetch될 리소스나 클라이언트 자체에 대한 상세정보를 포함하는 헤더
* 3.response header
* 위치나 서버 자체와 같은 응답에 대한 부가적인 정보를 갖는 헤서
* 4. entity header
* 컨텐츠의 길이나 mime타입과 같은 엔티티 body에 대한 상세정보를 포함하는헤더
* (요청 응답모두 사용되며, 메세지 바디의 컨텐츠를 나타내기에get요청은 해당되지 않는다)
* */

public class RequestHeaderPrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement()); //request에 담겨오는 헤더를 다 출력해볼수있다.
        }
        System.out.println("====== request headers 값 출력하기 ===========");
        //accept : 요청을 보낼때 서버에게 요청할 응답 타입을 명시
        System.out.println("accept :"+request.getHeader("accept"));
        //accept-encoding : 응답시 원하는 인코딩방식
        System.out.println("accept-ecoding : "+request.getHeader("accept-ecoding"));
        //응답시 원하는 언어
        System.out.println("accept-language : "+request.getHeader("accept-language"));
        //http통신이 완료된 후에 네트워크 접속을 유지할지 결정(기본값keep-alive=연결을 열린상태로 유지)
        System.out.println("connection : "+request.getHeader("connection"));
        //서버의 도메인 네임과 서버가 현재 listening중인 tcp포트 지정(반드시 하나가 존재하고 두개면 404error)
        System.out.println("host : "+request.getHeader("host"));
        //이페이지 이전에 대한 주소
        System.out.println("referer : "+request.getHeader("referer"));
        //요청 대상
        System.out.println("sec-fetch-dest : "+request.getHeader("sec-fetch-dest"));
        //요청모드
        System.out.println("sec-fetch-mode : "+request.getHeader("sec-fetch-mode"));
        //출처(origin)와 요청된 resource사이의 관계
        System.out.println("sec-fetch-site : "+request.getHeader("sec-fetch-site"));
        //사용자가 시작한 요청일때만 보내짐(항상 ?1값을 가짐)
        System.out.println("sec-fetch-user : "+request.getHeader("sec-fetch-user"));
        //캐시설정
        System.out.println("cache-control : "+request.getHeader("cache-control"));
        //클라이언트가 서버한테 http >https로 업그레이드를 요청할떄 ㅅ용
        System.out.println("upgrade-insecure-requests : "+request.getHeader("upgrade-insecure-requests"));
        //현재 사용자가 어떤 클라이언트를 이용해 보낸 요청인지 명시
        System.out.println("user-agent : "+request.getHeader("user-agent"));

    }


}
