package com.java.fundamentals.codingQuestions.levelThree;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : " );
        int n=sc.nextInt();
        long product = 1;
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//        System.out.println(product);
        // using while loop
//        int j = n;
//        while(j>0){
//            product *=j;
//            j--;
//        }
//        System.out.println(product);

        // using do-while loop
        int k = n;
        do{
            product *=k;
            k--;
        }while(k>0);
        System.out.println("Factorial of " + n + " is : " + product);

    }
}
