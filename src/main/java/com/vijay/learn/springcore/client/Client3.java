/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.client;

import com.vijay.learn.springcore.beandi.Student;
import com.vijay.learn.springcore.beaninheritance.Father;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationConfig-core3.xml");

        Father father = context.getBean("father", Father.class);
        System.out.printf("Bean Inheitance - Father's name is %s %s : %n",father.getFirstName(),father.getLastName());

        Father child = context.getBean("child", Father.class);
        System.out.printf("Bean Inheitance - Child's name %s %s : %n",child.getFirstName(),child.getLastName());
    }
}
