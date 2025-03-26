package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type in a String to be reversed: ");
        String inputString = input.nextLine();
        String reversed = new StringBuilder(inputString).reverse().toString();
        System.out.println(reversed);
    }
}