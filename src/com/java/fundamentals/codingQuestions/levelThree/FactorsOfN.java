package com.java.fundamentals.codingQuestions.levelThree;

import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();

        int i =1;
        while(i*i<=n){
            if(n % i == 0){
                System.out.print(i + "  " );
            }
            if(i != n/i){
                System.out.print((n/i) + " ");
            }
            i++;
        }
    }
}
