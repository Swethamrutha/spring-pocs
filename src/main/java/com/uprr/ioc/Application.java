package com.uprr.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PrintMessageBean obj = (PrintMessageBean)context.getBean("printMessageBean");
        System.out.println(obj.getMessage());
        System.out.println(obj);
        System.out.println(context);

    }
}
