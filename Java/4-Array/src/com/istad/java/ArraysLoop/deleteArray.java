package com.istad.java.ArraysLoop;

import java.util.Arrays;
import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {

        String[] productNames = {
                "Coke",
                "Sting",
                "Pepsi",
                "Milk tea",
                "Red Bull",
                "Sprite",
                "Fanta",
                "Iced Coffee"
        };

        // String[] newArray = null;

        System.out.println(Arrays.toString(productNames));
        System.out.println("[+] Insert element to delete: ");
        String elementThatWantToDelete = new Scanner(System.in).nextLine();

        // Delete using Stream
        String[] newArray = Arrays.stream(productNames)
                // .filter(product -> !product.equalsIgnoreCase(elementThatWantToDelete))
                .filter(p -> !p.equals(elementThatWantToDelete))
                .toArray(String[]::new);

        // Print result
        System.out.println("After delete: " + Arrays.toString(newArray));

//       for(int i = 0; i < productNames.length; i++){
//           if (productNames[i].equals(elementThatWantToDelete)){
//               productNames[i] = null;
//               newArray = new String[productNames.length-1];
//
//               // logic to copy her
//               int k  = 0;
//               for (int j=0; j < newArray.length; j++){
//                   if (productNames[j] != null){
//                       newArray[k] = productNames[j];
//                       k++;
//                   }
//               }
//
//               break;
//           }
//       }

        // Show result
        // System.out.println(Arrays.toString(productNames));
    }
}
