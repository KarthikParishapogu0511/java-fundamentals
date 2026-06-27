package com.java.fundamentals.codingQuestions.levelThree;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = input.nextInt();
        System.out.println("Enter a number: ");
        int n2 = input.nextInt();
        int maximum  = n1 > n2 ? n1 : n2;
        while(true){
            if(maximum % n1 == 0 && maximum % n2 == 0){
                System.out.println(maximum);
                break;
            }
            maximum+= 1;
        }
    }
}
