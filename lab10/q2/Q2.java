package com.mycompany.q2;

public class Q2 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        try {
            numbers[3] = 90;
            System.out.println("Result is " + numbers[3]);
            int ans = numbers[2] / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }
}
