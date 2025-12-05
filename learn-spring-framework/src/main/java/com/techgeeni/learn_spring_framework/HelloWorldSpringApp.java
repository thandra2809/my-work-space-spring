package com.techgeeni.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringApp {

    public static void main(String[] args) {
        // Launch Sprint Context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("address"));

        // Configure the things that spring should manage
        System.out.println("Hello World!");

    }
}
