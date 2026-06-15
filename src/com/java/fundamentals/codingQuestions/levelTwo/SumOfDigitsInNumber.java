package com.java.fundamentals.codingQuestions.levelTwo;

import java.util.Scanner;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        // Using While-loop
//        while (num != 0) {
//            //int digit  = num % 10;
//            sum += num%10;
//            num /= 10;
//        }
//        System.out.println("The sum of digits : " + sum);

        // using do-while loop
        do{
            sum += num%10;
            num /= 10;
        }while(num != 0);
        System.out.println("The sum is: " + sum);

        sc.close();
    }
}
