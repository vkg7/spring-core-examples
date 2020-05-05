/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component("spel")
public class SpringExpression {

    @Value("#{T(java.lang.Math).random()}")
    private double constant;

    @Value("#{T(java.time.LocalDate).now()}")
    private LocalDate currentDate;

    @Value("#{T(java.lang.Math).PI * 45}")
    private double PI;

    public double getConstant() {
        return constant;
    }

    public void setConstant(double constant) {
        this.constant = constant;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
}

