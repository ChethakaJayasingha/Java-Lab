package com.mycompany.q2;

public class Priest implements Speaker {

    final String x = "Buddhism";

    public void speak() {
        System.out.println("The Priest said that, " + x);
    }
}
