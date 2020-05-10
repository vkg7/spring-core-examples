/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.client;

import com.vijay.learn.springcore.spel.SpringExpression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExpressionClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcore/spring-application-context-autodiscovery.xml");
        SpringExpression spel = context.getBean("spel", SpringExpression.class);

        System.out.println("Constant :"+spel.getConstant());
        System.out.println("PI value: " +spel.getPI());
        System.out.println("Current Date: " +spel.getCurrentDate());
        System.out.println("Current City: " +spel.getCurrentCity());

    }

}
