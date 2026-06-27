package com.java.fundamentals.codingQuestions.levelThree;

import java.util.Scanner;

public class GCDHCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = input.nextInt();
        System.out.println("Enter a number: ");
        int n2 = input.nextInt();
        input.close();
        int gcd =1;
        int min = (n1 < n2) ? n1 : n2;

        for(int i =1;i<=min;i++){
            if(n1 % i==0 && n2 % i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);

    }
}
