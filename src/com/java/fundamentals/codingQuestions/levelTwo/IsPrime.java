package com.java.fundamentals.codingQuestions.levelTwo;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int num = scanner.nextInt();
        if(num <= 1) System.out.println("Not Prime");
        boolean isPrimeNum = true;
        for(int i = 2;i <= num/2 ;i++){
            if(num % i == 0){
                isPrimeNum =false;
                break;
            }
        }
        if (isPrimeNum){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
