package online.controlstatement.java;

import java.util.Scanner;

public class introduction {
    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        String name = new Scanner(System.in).nextLine();

        String [] names = name.split(",");

        for (String n : names) {
            System.out.println(n.trim());
        }
    }
}
