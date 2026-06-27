package com.java.fundamentals.codingQuestions.levelThree;

import java.util.Scanner;

public class isHarshadNivenNumber {

    public static void main(String[] args) {

        // A number is called harshad Niven number when the number itself is divisible by the sum of its own digits
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int temp = n;
        int sum =0;
        while (temp > 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        if(n % sum == 0){
            System.out.println("It's Harshad Niven Number");
        }else {
            System.out.println("Not Harshad Niven Number");
        }
    }
}
