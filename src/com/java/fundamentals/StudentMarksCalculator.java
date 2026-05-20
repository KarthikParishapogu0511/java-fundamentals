package com.java.fundamentals;

import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student  Full Name : ");
        String studentFullName = scanner.nextLine();

        System.out.println("Enter Student Id : ");
        int studentId = scanner.nextInt();

        System.out.println("Enter Telugu Marks : ");
        byte teluguMarks = scanner.nextByte();

        System.out.println("Enter Hindi Marks : ");
        byte hindiMarks = scanner.nextByte();

        System.out.println("Enter English Marks : ");
        byte englishMarks = scanner.nextByte();

        System.out.println("Enter Maths Marks : ");
        byte mathMarks = scanner.nextByte();

        System.out.println("Enter Science Marks : ");
        byte scienceMarks = scanner.nextByte();

        System.out.println("Enter Social Marks : ");
        byte socialMarks = scanner.nextByte();
        System.out.println("----Students Marks Calculator ----");
        System.out.println("Student Name : " + studentFullName);
        System.out.println("Student Id : " + studentId);

        //System.out.println("Total Marks : ");
        short totalMarks = (short) (teluguMarks + hindiMarks + englishMarks + mathMarks + scienceMarks + socialMarks);
        System.out.println("Total Marks : " + totalMarks);
        //System.out.println("Average Marks : ");
        float avgMarks = totalMarks/6.0F;
        System.out.println("Average Marks : " + avgMarks);


    }
}
