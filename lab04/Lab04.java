package com.mycompany.lab04;

public class Lab04 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setEmpDetails(27987, "Amal", "CEO");
        e2.setEmpDetails(45874, "Kamal", "Manager");

        System.out.println("Employee ID :" + e1.getEmpId());
        System.out.println("Employee Name :" + e1.getEmpName());
        System.out.println("Employee Designation :" + e1.getEmpDesing());

        System.out.println("Employee ID :" + e2.getEmpId());
        System.out.println("Employee Name :" + e2.getEmpName());
        System.out.println("Employee Designation :" + e2.getEmpDesing());
    }
}
