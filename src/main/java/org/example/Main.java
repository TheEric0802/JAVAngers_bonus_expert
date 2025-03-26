package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type in a String to be reversed: ");
        String inputString = input.nextLine();

        String reversed = new StringBuilder(inputString).reverse().toString();
        System.out.println(reversed);

        int[] numbers = {6, 2, 8, 3, 9, 6};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}