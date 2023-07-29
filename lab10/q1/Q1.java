package com.mycompany.q1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n1, n2, ans;
        System.out.print("Enter First Number: ");
        n1 = a.nextInt();

        System.out.print("Enter Second Number: ");
        n2 = a.nextInt();
        try {
            ans = n1 / n2;
            System.out.println("Devided Answer is " + ans);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
