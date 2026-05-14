package com.java.fundamentals;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Name : ");
        String productName = scanner.nextLine();

        System.out.println("Enter Product ID : ");
        int productId = scanner.nextInt();

        System.out.println("Enter Category Code : ");
        char categoryCode = scanner.next().charAt(0);

        System.out.println("Enter Quantity Available : ");
        short qualityAvailable = scanner.nextShort();

        System.out.println("Enter Unit Price : ");
        double unitPrice = scanner.nextDouble();

        System.out.println("Enter Discount Percentage : ");
        float discountPercentage = scanner.nextFloat();

        System.out.println("Enter Supplier Contact : ");
        long supplierContract = scanner.nextLong();

        System.out.println("Is Product Available : ");
        boolean isProductAvailable = scanner.nextBoolean();

        System.out.println("Enter Product Rating : ");
        byte productRating = scanner.nextByte();

        scanner.close();

        System.out.println("----- Product Details ------");
        System.out.println("Product Name : " + productName);
        System.out.println("Product Id : " + productId);
        System.out.println("Category Code : " + categoryCode);
        System.out.println("Quantity : " + qualityAvailable);
        System.out.println("Price : " + unitPrice);
        System.out.println("discount : "+ discountPercentage);
        System.out.println("supplier Contact : "+ supplierContract);
        System.out.println("Is Product Available : " + isProductAvailable);
        System.out.println("Rating : " + productRating);

    }
}
