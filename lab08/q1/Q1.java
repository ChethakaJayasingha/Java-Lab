package com.mycompany.q1;

public class Q1 {

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount();
        s1.setBalance(200_000.00);
        double SavingInterest = s1.calculateInterest();
        System.out.println("Saving Interest is " + SavingInterest);

        CheckingAccount c1 = new CheckingAccount();
        c1.setBalance(100_000.00);
        double ChekingInterest = c1.calculateInterest();
        System.out.println("Cheking Interest is " + ChekingInterest);
    }
}
