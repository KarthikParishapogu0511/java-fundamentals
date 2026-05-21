package com.java.fundamentals;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible ");
        }

        boolean isStockAvailable = false;
        if (isStockAvailable){
            System.out.println("Product is Available");
        }else{
            System.out.println("Product is not Available");
        }
    }
}
