package com.java.fundamentals.codingQuestions.levelOne;

import java.util.Scanner;

public class PrintNumFromOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();

        // Using for loop Logic
        System.out.println("Using for loop logic");
        for(int i = 1;i < num + 1; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------");

        //Using do-while loop Logic
        System.out.println("Using do-while Logic");
        int n = 1;
        do {
            System.out.print(n + " ");
            n++;
        }while(n <= num);
        System.out.println();
        System.out.println("-----------------------");

        //using while loop Logic
        System.out.println("Using while loop logic ");
        int a =1;
        while(a <= num){
            System.out.print(a + " ");
            a++;
        }
    }
}
