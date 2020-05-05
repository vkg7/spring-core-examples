/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.client;

import com.vijay.learn.springcore.beandi.CollectionsDI;
import com.vijay.learn.springcore.beandi.Student;
import com.vijay.learn.springcore.beandi.User;
import com.vijay.learn.springcore.beanlifecycle.BeanLifeCycleAnnotations;
import com.vijay.learn.springcore.beanlifecycle.BeanLifeCycleInterface;
import com.vijay.learn.springcore.beanlifecycle.BeanLifeCycleXML;
import com.vijay.learn.springcore.beanscope.BeanScope;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientBeanLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationConfig-beanlifecycle.xml");

        BeanLifeCycleXML beanLifeCycle = context.getBean("beanLifeCycleXML", BeanLifeCycleXML.class);
        beanLifeCycle.sayHello();

        BeanLifeCycleInterface beanLifeCycleInterface = context.getBean("beanLifeCycleInterface", BeanLifeCycleInterface.class);
        beanLifeCycleInterface.sayHello();

        BeanLifeCycleAnnotations beanLifeCycleAnnotations = context.getBean("beanLifeCycleAnnotations", BeanLifeCycleAnnotations.class);
        beanLifeCycleAnnotations.sayHello();

        ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
