package com.java.fundamentals.codingQuestions;

import java.util.Scanner;

public class SumOfFirst_N_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i =1 ;i < num + 1; i++){
            sum += i;
        }
        System.out.println("Sum Of " + num + " Numbers = " + sum);
        scanner.close();
    }
}
