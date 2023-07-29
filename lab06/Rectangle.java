package com.mycompany.lab06;

public class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public void calArea() {
        area = length * width;
    }
}
