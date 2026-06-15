package com.java.fundamentals.codingQuestions.levelTwo;

import java.util.Scanner;

public class SmallestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int smallestDigit = 9;
        //using while loop
        while ( n != 0){
            int digit = n % 10;
            if(digit < smallestDigit){
                smallestDigit = digit;
            }
            n /= 10;
        }
        System.out.println(smallestDigit);
    }
}
