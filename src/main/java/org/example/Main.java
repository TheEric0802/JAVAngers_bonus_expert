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

        System.out.println(Arrays.toString(csvToArray("Affe,Banane,Pferd,Tisch")));

        System.out.println(getQuersumme(1234));
    }

    public static String[] csvToArray(String csv) {
        return csv.split(",");
    }

    public static int getQuersumme(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}