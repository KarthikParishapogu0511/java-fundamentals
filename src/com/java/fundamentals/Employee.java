package com.java.fundamentals;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Full Name : ");
        String employeeFullName = scanner.nextLine();

        System.out.println("Enter Employee ID : ");
        int employeeId = scanner.nextInt();

        System.out.println("Enter Employee Age : ");
        byte employeeAge = scanner.nextByte();

        System.out.println("Enter Department Code : ");
        char departmentCode = scanner.next().charAt(0);

        System.out.println("Enter Monthly Salary : ");
        double monthlySalary = scanner.nextDouble();

        System.out.println("Enter Years Of Experience : ");
        short yearsOfExperience = scanner.nextShort();

        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();

        System.out.println("Is Employee Permanent : ");
        boolean isPermanentEmployee = scanner.nextBoolean();

        System.out.println("Enter Performance Rating : ");
        float performanceRating = scanner.nextFloat();

        System.out.println("-----Employee Details -----");
        System.out.println("Employee Full Name : " + employeeFullName);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Age : " + employeeAge);
        System.out.println("Department Code : " + departmentCode);
        System.out.println("Monthly Salary : " + monthlySalary);
        System.out.println("Years Of Experience : " + yearsOfExperience);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Is Permanent Employee : " + isPermanentEmployee);
        System.out.println("Performance Rating : " + performanceRating);
        scanner.close();
    }
}
