package com.mycompany.lab06;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calArea() {
        area = Math.PI * radius * radius;
    }
}
