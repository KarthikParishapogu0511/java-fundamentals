package com.java.fundamentals.codingQuestions.levelTwo;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int onum = n;
        sc.close();
        int rev =0;
        while(n!=0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        if(rev==onum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
