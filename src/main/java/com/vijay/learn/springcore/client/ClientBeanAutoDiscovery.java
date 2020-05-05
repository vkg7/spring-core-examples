/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.client;

import com.vijay.learn.springcore.beanautodiscovery.BeanAutoDiscovery;
import com.vijay.learn.springcore.beanlifecycle.BeanLifeCycleXML;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientBeanAutoDiscovery {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-application-context-autodiscovery.xml");

        BeanAutoDiscovery beanAutoDiscovery = applicationContext.getBean("beanAutoDiscovery", BeanAutoDiscovery.class);
        beanAutoDiscovery.sayHello();
    }


}
