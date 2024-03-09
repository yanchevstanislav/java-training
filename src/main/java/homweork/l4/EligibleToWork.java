package main.java.homweork.l4;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        double age = scanner.nextDouble();

        if (age >= 18) {

            System.out.println("You are eligible to work!");
        }else{
            System.out.println("Sorry, you are not eligible to work.");
        }
    }
}