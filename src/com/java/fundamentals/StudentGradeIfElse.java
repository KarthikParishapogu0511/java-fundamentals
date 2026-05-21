package com.java.fundamentals;

import java.util.Scanner;

public class StudentGradeIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Example of Nested If-Else Statement

        System.out.println("Enter subject 1 Marks : ");
        int subject1 = scanner.nextInt();
        System.out.println("Enter subject 2 Marks : ");
        int subject2 = scanner.nextInt();
        System.out.println("Enter subject 3 Marks : ");
        int subject3 = scanner.nextInt();
        System.out.println("Enter subject 4 Marks : ");
        int subject4 = scanner.nextInt();
        System.out.println("Enter subject 5 Marks : ");
        int subject5 = scanner.nextInt();
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println("Total Marks : " + totalMarks);

        int avgMarks = totalMarks/5;
        System.out.println("Average Marks : " + avgMarks);
        // > 70 -> A
        // > 60 and < 70 -> B
        // > 50 and < 60 -> C
        // > 40 and < 50 -> D
        // < 40 -> F

        if(avgMarks >= 70){
            System.out.println("Grade : A ");
        } else if (avgMarks >= 60) {
            System.out.println("Grade : B");
        } else if (avgMarks >= 50) {
            System.out.println("Grade : C ");
        }else if(avgMarks >= 40){
            System.out.println("Grade : D");
        }else{
            System.out.println("Grade : F");
        }

    }
}
