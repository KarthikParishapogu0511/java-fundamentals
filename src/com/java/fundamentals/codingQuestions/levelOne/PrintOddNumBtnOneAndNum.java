package com.java.fundamentals.codingQuestions.levelOne;

import java.util.Scanner;

public class PrintOddNumBtnOneAndNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        System.out.println("Using For Loop");
        for(int i = 1;i <= n;i++){
            if(i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------");

        System.out.println("Using While Loop Logic");

        int j = 1;
        while(j <= n){
            if(j % 2 != 0) System.out.print(j + " ");
            j++;
        }
        System.out.println();
        System.out.println("---------------------");

        System.out.println("Using Do While Loop Logic");
        int k = 1;
        do{
            if(k % 2 != 0) System.out.print(k + " ");
            k++;
        }while(k <= n);
    }
}
