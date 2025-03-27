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

        System.out.println("Type in a Number to be converted to roman: ");
        int inputNumber = input.nextInt();
        System.out.println(getRomanNumber(inputNumber));
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

    public static String getRomanNumber(int number) {
        StringBuilder romanNumber = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                romanNumber.append(symbols[i]);
                number -= values[i];
            }
        }

        return romanNumber.toString();
    }
}