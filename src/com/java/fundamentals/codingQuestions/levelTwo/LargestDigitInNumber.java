package com.java.fundamentals.codingQuestions.levelTwo;

import java.util.Scanner;

public class LargestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        int largestDigit = 0;
        // using while loop
        while (num != 0) {
            int digit = num % 10;
            if(digit > largestDigit){
                largestDigit = digit;
            }
            num = num / 10;
        }
        System.out.println(largestDigit);
    }
}
