/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.client;

import com.vijay.learn.springcore.beanlifecycle.BeanLifeCycleInterface;
import com.vijay.learn.springcore.beanlifecycle.BeanLifeCycleXML;
import com.vijay.learn.springcore.beandi.CollectionsDI;
import com.vijay.learn.springcore.beandi.Student;
import com.vijay.learn.springcore.beandi.User;
import com.vijay.learn.springcore.beanscope.BeanScope;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationConfig-di.xml");
        //Dependency Injection example where User HAS-A relationship with Car
        User user = context.getBean("user", User.class);
        System.out.printf("User '%s' has car named '%s' with per day cost at Rs. %d. %n",user.getUserName(),user.getCar().getName(),user.getCar().getPerDayCost());

        Student student = context.getBean("student", Student.class);
        System.out.printf("student : %s %n",student.toString());

        Student studentInnerBean = context.getBean("studentInnerBean", Student.class);
        System.out.printf("studentInnerBean : %s %n",studentInnerBean.toString());

        Student student_alias = context.getBean("student_alias", Student.class);
        System.out.printf("student_alias : %s %n",student_alias.toString());

        Student studentIdRef = context.getBean("studentIdRef", Student.class);
        System.out.printf("studentIdRef : %s %n",studentIdRef.toString());

        CollectionsDI collectionsDI = context.getBean("collectionsDI", CollectionsDI.class);
        System.out.printf("collectionsDI : %s %n",collectionsDI.toString());

        BeanLifeCycleXML beanLifeCycle = context.getBean("beanLifeCycleXML", BeanLifeCycleXML.class);
        beanLifeCycle.sayHello();

        BeanLifeCycleInterface beanLifeCycleInterface = context.getBean("beanLifeCycleInterface", BeanLifeCycleInterface.class);
        beanLifeCycleInterface.sayHello();

        BeanScope beanScope = context.getBean("beanScope", BeanScope.class);
        beanScope.setMessage("We are testign Bean's Scope...");
        System.out.printf("Bean's Scope - message is %s : %n",beanScope.getMessage());

        BeanScope beanScope1 = context.getBean("beanScope", BeanScope.class);
        System.out.printf("Bean's Scope -  message is %s : %n",beanScope1.getMessage());

        ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
