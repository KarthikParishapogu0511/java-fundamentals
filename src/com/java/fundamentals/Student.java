package com.java.fundamentals;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Student  Full Name : ");
        String studentFullName = scanner.nextLine();

        System.out.println("Enter Student Age : ");
        byte studentAge = scanner.nextByte();

        System.out.println("Enter Section : ");
        char section = scanner.next().charAt(0);

        System.out.println("Enter Total Marks : ");
        int totalMarks = scanner.nextInt();

        System.out.println("Enter Average Marks : ");
        float avgMarks = scanner.nextFloat();

        System.out.println("Enter Years of Joining : ");
        short yearsOfJoining  = scanner.nextShort();

        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();

        System.out.println("Is Student Passed : ");
        boolean isStudentPassed = scanner.nextBoolean();

        System.out.println("---- Enter Student Details ----");
        System.out.println("Student Name : " + studentFullName);
        System.out.println("Student ID : " + studentAge);
        System.out.println("Section : " + section);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Marks : " + avgMarks);
        System.out.println("Years Of Joining : " + yearsOfJoining);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Is Passed : " + isStudentPassed);
        scanner.close();

    }}
