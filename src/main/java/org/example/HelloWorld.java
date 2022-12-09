package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class HelloWorld implements InitializingBean , DisposableBean{
    private String message1;
    private String message2;

    public void getMessage1() {
        System.out.println("Your message: "+ message1);
    }
    public void getMessage2(){
        System.out.println("Your message: "+ message2);
    }
    public void setMessage1(String message) {
        this.message1 = message;
    }

    public void setMessage2(String message){
        this.message2 = message;
    }
    public void afterPropertiesSet() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}
