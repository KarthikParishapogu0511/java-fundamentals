package com.java.fundamentals.codingQuestions.levelOne;

import java.util.Scanner;

public class PrintMultiplicationTableOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = scanner.nextInt();

        // using for loop
        for(int i = 1;i <= 10;i++){
            System.out.println(n + "  *  " +i + " = " + n*i );
        }

        // using do-while loop
        int j =1;
        do{
            System.out.println(n + "  *  " +j + " = " + n*j );
            j++;
        }while(j <= 10);

        // using while loop
        int k =1;
        while(k <= 10){
            System.out.println(n + "  *  " +k + " = " + n*k );
            k++;
        }
    }
}
