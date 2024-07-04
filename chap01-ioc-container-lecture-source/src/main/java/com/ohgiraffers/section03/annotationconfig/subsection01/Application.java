package com.ohgiraffers.section03.annotationconfig.subsection01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        /*
        * getbeanDefinitionNames :스프링컨테이너에서 생성된 bean들의이름을 배열로 반환한다
        * */

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames){
            System.out.println(beanName);
        }


    }

}
