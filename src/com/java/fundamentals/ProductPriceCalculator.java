package com.java.fundamentals;

import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Name : ");
        String productName = scanner.nextLine();

        System.out.println("Enter Product ID : ");
        int productId = scanner.nextInt();

        System.out.println("Enter Product Max Retail Price : ");
        float maxRetailPrice = scanner.nextFloat();

        System.out.println("Enter Discount Percentage : ");
        float discountPercentage = scanner.nextFloat();

        final float stateTaxPercentage,centralTaxPercentage;
        stateTaxPercentage = 2.5F;
        centralTaxPercentage = 2.5F;
        float productDiscountedAmount = (maxRetailPrice * discountPercentage)/100.0F ;
        float priceAfterDiscount = maxRetailPrice - productDiscountedAmount;
        System.out.println("-----Product Price Calculation ------");
        System.out.println("ProductName : " + productName);
        System.out.println("Product Id : " + productId);
        System.out.println("Product Discounted Amount : " + productDiscountedAmount );
        System.out.println("Price after Discount : " + priceAfterDiscount);

        float stateTax = (priceAfterDiscount * stateTaxPercentage)/100.0F;
        System.out.println("productStateTax : " + stateTax);
        float centralTax = (priceAfterDiscount * centralTaxPercentage)/100.0F;
        System.out.println("productCentralTax : " + centralTax);
        float finalPrice = priceAfterDiscount + stateTax + centralTax;
        System.out.println("Product Final Price : " + finalPrice);



    }
}
