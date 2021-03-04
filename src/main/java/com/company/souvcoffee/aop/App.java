package com.company.souvcoffee.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {


        /*AOP 설정 방법  https://araikuma.tistory.com/302?category=780532*/
        // xml :
        // ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        //java class
        ApplicationContext app = new AnnotationConfigApplicationContext(SampleAopConfig.class);

        SampleAopBean bean1 = (SampleAopBean) app.getBean("sampleAopBean");
        bean1.printMessage();

        System.out.println("----------------------------------------------------------");

        SampleAopBean bean2 = (SampleAopBean) app.getBean("proxyFactoryBean");
        bean2.printMessage();


    }
}
