package main.java.homework.l4;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age;

        while (true) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextDouble()) {
                age = scanner.nextDouble();
                if (age >= 18 && age < 65) {
                    break;
                } else {
                    System.out.println("Sorry! You are not eligible to work.");
                }
            } else {
                System.out.println("Invalid input.");
                scanner.next();
            }
        }
        System.out.println("You are eligible to work.");
    }
}