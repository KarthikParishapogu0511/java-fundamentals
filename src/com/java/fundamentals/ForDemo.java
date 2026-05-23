package com.java.fundamentals;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = scanner.nextInt();
        for(int num = 1; num <= n;num++){
            if(num % 2 == 0) System.out.println(num);
        }
    }
}
