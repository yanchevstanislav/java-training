package main.java.homework.l6;

import java.util.Scanner;

public class EvenNumbers {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num1 = numInput.nextInt();

        System.out.println(num1 + " is even: " + isEven(num1));
    }
}
