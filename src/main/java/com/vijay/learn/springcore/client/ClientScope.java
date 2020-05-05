/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.client;

import com.vijay.learn.springcore.beanscope.BeanScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-application-context-scope.xml");

        BeanScope beanScope = context.getBean("beanScope", BeanScope.class);
        beanScope.setMessage("We are testign Bean's Scope...");
        System.out.printf("Bean's Scope - message is %s : %n",beanScope.getMessage());

        BeanScope beanScope1 = context.getBean("beanScope", BeanScope.class);
        System.out.printf("Bean's Scope -  message is %s : %n",beanScope1.getMessage());
    }
}
