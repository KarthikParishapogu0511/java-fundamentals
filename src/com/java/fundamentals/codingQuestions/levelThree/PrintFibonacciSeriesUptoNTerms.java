package com.java.fundamentals.codingQuestions.levelThree;

import java.util.Scanner;

public class PrintFibonacciSeriesUptoNTerms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Fibonacci Series is  sequence where each number is sum of previous two numbers
        
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        input.close();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 3; i <= n; i++){
            int n3  = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
