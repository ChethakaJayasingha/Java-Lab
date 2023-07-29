package com.mycompany.q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        try {
            File f1 = new File("\"C:\\Users\\chethaka\\Documents\\Java\\Lab10\\Q3\\Java.txt\"");
            Scanner sc = new Scanner(f1);

            while (sc.hasNextLine()) {
                String t = sc.nextLine();
                System.out.println(t);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
