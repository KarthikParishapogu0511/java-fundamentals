package com.java.fundamentals;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        /*
        int to int is int
        real to int -> real
        int to real-> real         to real -> real
         */
        System.out.println(10+20);//30
        System.out.println(10-20);//-10
        System.out.println(10*20);//200
        System.out.println(10/20);//0 Both are Int so res is Int
        System.out.println(10/20.0);//0.5 one is Int and another one is double
        System.out.println(10%20);//10

        //operator precedence
        System.out.println(10 + 20 - 30 * 40 / 50 % 60);

        //Compound Assignment Operators
        int salary = 768599;
        salary += 35900;
        System.out.println(salary);


        //increment and decrement operators as both are Unary Operators
        /* ++ and --
        Pre Increment and Post Increment
        Pre Decrement and Post Decrement
         */
        int no = 10;
        System.out.println(no++); //postIncrement
        System.out.println(++no); //preIncrement
        int no1 =20;
        System.out.println(no1--); //postDecrement
        System.out.println(--no1); // preDecrement

        //Assignment 1
        //Calculate student marks and find total Average marks
        //Assignment 2
        //Product {maxRetailPrice,DiscountPercentage}
        //product discount amount
        //price after discount
        //final price based on the tax(CentralTax = 2.5% ,stateTax = 2.5%)

        /*
        1000,10%
        100
        900
        900 *2.5% centralTax
        900 * 2.5% stateTax
        finalPrice = 900 + 22.5+22.5 = 945


         */
    }
}
