package com.mycompany.lab06;

abstract public class Shape {

    protected double area;

    public abstract void calArea();

    public void display() {
        System.out.println("Area " + area);
    }
}
