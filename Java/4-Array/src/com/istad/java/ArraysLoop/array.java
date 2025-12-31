package com.istad.java.ArraysLoop;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] productNames = {"Coke", "Sting", "Pepsi", "Milk tea"};

        // for loop
        int round = 0;
        for(int i =0; i < productNames.length; i++, round++){
            System.out.println("Round["+ round +"]: "+productNames[i]);
        }

        // for each
        for(String product : productNames) {
            System.out.println("Product["+ product +"]: "+product);
        }

        // java new feature | stream API
        // Arrays.stream(productNames).forEach(System.out::println);
        Arrays.stream(productNames).filter(p ->p.startsWith("C"))
                .forEach(System.out::println);
    }
}
