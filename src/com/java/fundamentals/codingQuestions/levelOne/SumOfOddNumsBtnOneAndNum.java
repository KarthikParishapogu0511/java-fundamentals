package com.java.fundamentals.codingQuestions.levelOne;

import java.util.Scanner;

public class SumOfOddNumsBtnOneAndNum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();
        //using for loop
        int sumfor = 0;
        for(int i = 1;i <=n;i++){
            if(i % 2 != 0)sumfor += i;
        }
        System.out.println("using For loop sum of Odd Nums :" + sumfor);

        System.out.println("-----------------------");
        //using do-while loop
        int j =1;
        int sumDoWhile = 0;
        do{
            if(j % 2 != 0) sumDoWhile += j;
            j++;
        }while(j<=n);
        System.out.println("Using Do While loop : " + sumDoWhile);
        System.out.println("-------------------------");

        // using while loop
        int k =1;
        int sumWhile = 0;
        while(k <= n){
            if(k % 2 != 0) sumWhile += k;
            k++;
        }
        System.out.println("Using While Loop : " + sumWhile) ;
    }
}
