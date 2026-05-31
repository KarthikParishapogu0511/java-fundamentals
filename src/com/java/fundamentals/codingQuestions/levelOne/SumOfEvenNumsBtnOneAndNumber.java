package com.java.fundamentals.codingQuestions.levelOne;

import java.util.Scanner;

public class SumOfEvenNumsBtnOneAndNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = scanner.nextInt();
        //using for loop
        for(int i = 1;i <=n;i++){
            if(i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------");
        //using do-while loop
        int j =1;
        do{
            if(j % 2 == 0) System.out.print(j + " ");
            j++;
        }while(j<=n);
        System.out.println();
        System.out.println("-------------------------");

        // using while loop
        int k =1;
        while(k <= n){
            if(k % 2 == 0) System.out.print(k + " ");
            k++;
        }
    }
}
