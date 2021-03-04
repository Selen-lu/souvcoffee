package com.company.souvcoffee.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SampleMethodAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

    // 어떤 메소드 가 실행 전에 출력
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object target) throws Throwable {

        System.out.println("before" +  method.getName() + "["+ target+"]");
    }

    // 어떤 메소드 가 모두 끝났을 때 출력
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("*after: " + method.getName() + "[" + target + "]");

    }
}
