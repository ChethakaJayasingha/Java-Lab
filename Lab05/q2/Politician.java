package com.mycompany.q2;

public class Politician implements Speaker {

    final String x = "Country";

    public void speak() {
        System.out.println("The politician said that, " + x);
    }
}
