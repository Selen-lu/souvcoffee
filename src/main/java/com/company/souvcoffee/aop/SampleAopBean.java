package com.company.souvcoffee.aop;

public class SampleAopBean {
private String message;

    public SampleAopBean(String message) {
        this.message = message;
    }

    public SampleAopBean() { }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("message:["+message+"]");

    }
}
