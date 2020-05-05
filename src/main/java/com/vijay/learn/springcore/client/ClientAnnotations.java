/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.client;

import com.vijay.learn.springcore.annotations.Employee;
import com.vijay.learn.springcore.beaninheritance.Father;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationConfig-annotations.xml");

        Employee employee = context.getBean("employee", Employee.class);
        System.out.printf("Employee details = %s :%n",employee.toString());
    }
}
