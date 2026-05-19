package com.java.fundamentals;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //Implicit Conversion
        long countryGdp = 988776654321L;
        float countryGdpInDollarsF = countryGdp;
        System.out.println(countryGdpInDollarsF);

        /* Explicit Conversion
            Loss Of Data between Conversion */
        float country2GdpInDollarsF = 999987766554321.33F;
        long country2Gdp = (long) country2GdpInDollarsF;
        System.out.println(country2Gdp);

        byte no1,no2;
        no1=100;
        no2 = 30;
        byte res = (byte) (no1+no2);
        System.out.println(res);
        int res1 = no1 + no2;
        System.out.println(res1);


    }
}
