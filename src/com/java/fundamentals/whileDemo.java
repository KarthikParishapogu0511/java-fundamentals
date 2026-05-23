package com.java.fundamentals;

import java.util.Scanner;

public class whileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = scanner.nextInt();
        int number = 1;
        while(number <= n){
            if(number % 2 == 0)System.out.println(number);
            number++;
        }
    }
}
