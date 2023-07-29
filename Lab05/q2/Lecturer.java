package com.mycompany.q2;

public class Lecturer implements Speaker {

    final String x = "Java";

    public void speak() {

        System.out.println("The Lecture said that, " + x);
    }
}
