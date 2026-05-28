package com.java.fundamentals.codingQuestions.levelTwo;

import java.util.Scanner;

public class PrintAllPrimesBtnOneAndN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = scanner.nextInt();
        boolean isPrime;
        if(n <= 1) isPrime = false;
        for(int i =2;i <= n;i++){
            isPrime =true;
            for(int j = 2;j <= i/2 ;j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }

        }
    }
}
