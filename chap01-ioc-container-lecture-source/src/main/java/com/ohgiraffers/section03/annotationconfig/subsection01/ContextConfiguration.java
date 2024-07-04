package com.ohgiraffers.section03.annotationconfig.subsection01;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

//1. @ComponentScan(basePackages = "com.ohgiraffers")

//@ComponentScan(basePackages = "com.ohgiraffers",excludeFilters = {
//        @ComponentScan.Filter(
//                type = FilterType.ASSIGNABLE_TYPE,
//                classes = {MemberDAO.class}
//                //2. 어노테이션 종류로설정
//                type =  FilterType.ANNOTATION,
//                classes = {org.springframework.stereotype.Component.class}
//        )
//})
//3.
@ComponentScan(basePackages = "com.ohgiraffers",
//기본어노테이션 @component,@service,@repository,@controller)를 가진 클래스들이 자동으로
        useDefaultFilters = false,
        includeFilters = {
        //includeFilters : 기본필터이외에 추가로 포함시키고 싶은 클래스를 스캔할수있다
                @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        classes = {MemberDAO.class}
                )
        }
)
@Configuration("contextConfiguration3")
public class ContextConfiguration {
}
