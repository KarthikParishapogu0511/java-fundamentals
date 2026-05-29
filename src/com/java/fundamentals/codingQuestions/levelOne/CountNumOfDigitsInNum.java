package com.java.fundamentals.codingQuestions.levelOne;

import java.util.Scanner;

public class CountNumOfDigitsInNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = scanner.nextInt();
        int cnt =0;
        while(n > 0){
            n /= 10;
            cnt=cnt +1;

        }
        System.out.println("Count Of Digits in Number : "+ cnt);
    }
}
