package com.java.fundamentals.codingQuestions.levelOne;

import java.util.Scanner;

public class PrintNumFromNToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= scanner.nextInt();

        System.out.println("for loop Logic");
        for(int i = n;i >= 1;i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------");

        System.out.println("While Loop logic");
        int j =n;
        while(j >= 1){
            System.out.print(j + " ");
            j--;
        }

        System.out.println();
        System.out.println("--------------");

        System.out.println("Do while loop Logic");
        int k =n;
        do{
            System.out.print(k + " ");
            k--;
        }while (k >= 1);
    }
}
