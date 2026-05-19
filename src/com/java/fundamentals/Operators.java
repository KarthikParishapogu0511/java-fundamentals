package com.java.fundamentals;

public class Operators {
    public static void main(String[] args) {
        //Arthimetic Operators
        /*
        int to int is int
        real to int -> real
        int to real-> real
        real to real -> real
         */
        System.out.println(10+20);//30
        System.out.println(10-20);//-10
        System.out.println(10*20);//200
        System.out.println(10/20);//0 Both are Int so res is Int
        System.out.println(10/20.0);//0.5 one is Int and another one is double
        System.out.println(10%20);//10

        //operator precedence
        System.out.println(10 + 20 - 30 * 40 / 50 % 60);

        //COmpound Assignment Operators
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
    }
}
