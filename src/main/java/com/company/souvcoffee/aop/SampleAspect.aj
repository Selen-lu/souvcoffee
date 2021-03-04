package com.company.souvcoffee.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAspect {

/* execution 후의 괄호에 어떤 메소드에 이 메소드를 삽입할지 지정
* 모든 이름을 다 기술 안해도 o
* 불특정 인수를 지정 가능
* 
*  execution 작성법
* ex )       * com.company.souvcoffee.controller.*(..)
*    * .com의 * => pulbic or private 같은 것이 지정된 경우
*   .controller.*(..)의 * =>이 클래스 내에 있는 어떤 방법도 모두 대상이다
*    *(..)  ... =>  인수가 어떤 형태여도 해당
* */
    
    @Before("execution(* com.company.souvcoffee.aop.SamplecAopBean.*(..))") public void before() {
        System.out.println("before:");
    }
    @After("execution(* com.company.souvcoffee.aop.*(..))") public void after() {
        System.out.println("after:");
    }
}
