package com.java.fundamentals;

import java.util.Scanner;

public class CustomerFinalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Full Name : ");
        String customerName = scanner.nextLine();

        System.out.println("Enter Customer Email : ");
        String customerEmail = scanner.next();

        System.out.println("Enter Customer Mobile Number : ");
        long customerNumber = scanner.nextLong();

        System.out.println("Enter Customer Membership : ");
        char membership = scanner.next().charAt(0);

        System.out.println("Enter Customer Age : ");
        int customerAge = scanner.nextInt();

        System.out.println("Enter Product Price : ");
        float productPrice = scanner.nextFloat();

        float discountPercentage;
        if(customerAge > 50){
            if(membership == 'G'){
                discountPercentage = 0.5F;
            } else if (membership == 'S') {
                discountPercentage = 0.4F;
            }
            else if (membership == 'D'){
                discountPercentage = 0.6F;
            }
            else{
                discountPercentage = 0.1F;
            }
        }else{
            discountPercentage = 0.1F;
        }

        System.out.println("-----Customer Details -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Email : " + customerEmail);
        System.out.println("Customer Number : " + customerNumber);
        float discountedPrice = productPrice -  (productPrice * discountPercentage);
        System.out.println("Price After Discount : " + discountedPrice);
        final float centralTaxPercentage,stateTaxPercentage;
        centralTaxPercentage = 0.05F;
        stateTaxPercentage = 0.05F;

        float stateTaxOnProduct,centralTaxOnProduct;
        stateTaxOnProduct = discountedPrice * stateTaxPercentage;
        System.out.println("State Tax On Product : " + stateTaxOnProduct);
        centralTaxOnProduct = discountedPrice * centralTaxPercentage;
        System.out.println("Central Tax on Product : " + centralTaxOnProduct);

        float finalProductPrice = discountedPrice + stateTaxOnProduct + centralTaxOnProduct;
        System.out.println("Final Price To be Paid : " + finalProductPrice);
    }
}
