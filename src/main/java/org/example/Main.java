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
        String romanNumber = "";
        while (number >= 1000) {
            romanNumber += "M";
            number -= 1000;
        }
        while (number >= 900) {
            romanNumber += "CM";
            number -= 900;
        }
        while (number >= 500) {
            romanNumber += "D";
            number -= 500;
        }
        while (number >= 400) {
            romanNumber += "CD";
            number -= 400;
        }
        while (number >= 100) {
            romanNumber += "C";
            number -= 100;
        }
        while (number >= 90) {
            romanNumber += "XC";
            number -= 90;
        }
        while (number >= 50) {
            romanNumber += "L";
            number -= 50;
        }
        while (number >= 40) {
            romanNumber += "XL";
            number -= 40;
        }
        while (number >= 10) {
            romanNumber += "X";
            number -= 10;
        }
        while (number >= 9) {
            romanNumber += "IX";
            number -= 9;
        }
        while (number >= 5) {
            romanNumber += "V";
            number -= 5;
        }
        while (number >= 4) {
            romanNumber += "IV";
            number -= 4;
        }
        while (number >= 1) {
            romanNumber += "I";
            number -= 1;
        }

        return romanNumber;
    }
}