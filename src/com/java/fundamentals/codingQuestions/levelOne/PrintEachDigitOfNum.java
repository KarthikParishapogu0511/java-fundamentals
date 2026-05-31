package com.java.fundamentals.codingQuestions.levelOne;

import java.util.Scanner;

public class PrintEachDigitOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number  : ");
        int n = scanner.nextInt();
        while(n > 0){
            int digit = n%10;
            System.out.println(digit);
            n = n/10;
        }
        scanner.close();
    }
}
