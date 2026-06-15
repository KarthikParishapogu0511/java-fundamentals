package com.java.fundamentals.codingQuestions.levelTwo;

import java.util.Scanner;

public class ProductOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        long product = 1;
        // using while loop
//        while(num != 0){
//
//            product *= num % 10;
//            num /= 10;
//        }
//        System.out.println(product);

        //using do-while loop

        do{
            product *= num % 10;
            num /= 10;
        }while(num != 0);
        System.out.println(product);

        sc.close();
    }
}
