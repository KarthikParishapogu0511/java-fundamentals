package com.java.fundamentals;

public class Primitives {
    public static void main(String[] args) {
        byte age; // age isa variable (Variable Declaration)
        age =34;
        /*System.out.println(age);*/
        System.out.println("Age : "+ age);

        short manufacturedYear,currentYear;

        manufacturedYear =2024;
        currentYear = 2026;
        /*short manufacturedYear = 2026;
        short currentYear = 2024;*/

        /*System.out.println("Manufactured Year : "+ manufacturedYear);
        System.out.println("Current Year : " + currentYear);
        */
        System.out.println("Manufactured Year : " + manufacturedYear + " , Current Year : "+ currentYear);

        int salary,annualIncome ;
        salary =234567;
        annualIncome = 23456789;
        System.out.println("My Salary : " + salary + " and My Annual Income : "+ annualIncome);

        long companyAnnualIncome, countryGdp;
        companyAnnualIncome =1234567890L;
        countryGdp = 112233445566789L;
        System.out.println("Company Annual Income : "+ companyAnnualIncome + " , Country GDP : "+ countryGdp);

        // Real Numbers
        float discountPercentage;
        discountPercentage = 6.5F;

        double averagePrice;
        averagePrice = 12345.234;
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Average Price : " + averagePrice);

        char gender,membership;
        gender = 'M'; //maps to ASCII code  -> 77
        membership = 'G'; //maps to ASCII code -> 71
        System.out.println("Gender : " + gender);
        System.out.println("Membership : " + membership);

        char ch = 65;
        System.out.println(ch);
        char ch1 = 1;
        System.out.println(ch1);
        char ch2 = '1';
        System.out.println(ch2);

        boolean isLoggedIn ; // Available,Away,Meeting,Busy

    }
}
