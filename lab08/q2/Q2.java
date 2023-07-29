package com.mycompany.q2;

public class Q2 {

    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        double Circlearea = c1.calculateArea();
        double Circleperimeter = c1.calculatePerimeter();
        System.out.println("Area of Circle :" + Circlearea);
        System.out.println("Perimeter of Circle :" + Circleperimeter);

        System.out.println();

        Rectangle r1 = new Rectangle(7.00, 7.00);
        double Rectanglearea = r1.calculateArea();
        double Rectangleperemiter = r1.calculatePerimeter();
        System.out.println("Area of Rectangle :" + Rectanglearea);
        System.out.println("Perimeter of Rectangle :" + Rectangleperemiter);

        System.out.println();

        Triangle t1 = new Triangle(7.00, 5.00, 10.00, 15.00, 12.00);
        double Trianglearea = t1.calculateArea();
        double Triangleperemiter = t1.calculatePerimeter();
        System.out.println("Area of Triangle :" + Trianglearea);
        System.out.println("Perimeter of Triangle :" + Triangleperemiter);
    }
}
