/*
 * Copyright (c) 2020. All rights reserved .
 * This code developed by Vijay Gupta for learning purpose only.
 * Certification: Spring Framework Certification Training
 */

package com.vijay.learn.springcore.beandi;

public class Car {
    private String name;
    private int perDayCost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerDayCost() {
        return perDayCost;
    }

    public void setPerDayCost(int perDayCost) {
        this.perDayCost = perDayCost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", perDayCost=" + perDayCost +
                '}';
    }
}
