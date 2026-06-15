package com.java.fundamentals.codingQuestions.levelTwo;

import java.util.Scanner;

public class CountNumOfEvenAndOddDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int evenCount =0;
        int oddCount =0;
        // using while-loop
        while (n != 0){
            int digit = n % 10;
            if(digit % 2 == 0)evenCount++;
            else oddCount++;
            n /= 10;
        }
        System.out.println("Even numbers and odd numbers are: "+evenCount+"\n"+oddCount);
    }
}
