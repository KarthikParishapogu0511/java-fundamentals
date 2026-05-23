package com.java.fundamentals;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
        System.out.println("Welcome TO E-Commerce App");
        /*
        Men
        Women
        Kids
         */
        System.out.println("1 : MEN");
        System.out.println("2 : WOMEN");
        System.out.println("3 : Kids");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select Your Category");

        switch (scanner.nextInt()){
            case 1:
                System.out.println("You have selected Men's Category");
                System.out.println("1 : T-Shirt's");
                System.out.println("2 : Jeans");
                System.out.println("3 : Shoes");
                //Nested Switch
                switch (scanner.nextInt()){
                    case 1 :
                        System.out.println("You Have selected T-Shirt's Category");
                        break;
                    case 2 :
                        System.out.println("You Have selected Jeans Category");
                        break;
                    case 3 :
                        System.out.println("You Have Selected Shoes Category");
                        break;
                    default :
                        System.out.println("Invalid Category");
                }
                break;
            case 2:
                System.out.println("You have selected Women's Category ");
                break;
            case 3:
                System.out.println("You have selected Kid's Category");
                break;
            default:
                System.out.println("Invalid Category ");
        }


    }
}
