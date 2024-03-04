package main.java;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sideLength = new Scanner(System.in);

        double side1, side2, side3;

        while (true) {
            side1 = getPositiveNumber(sideLength, "Enter the length of side1:");
            side2 = getPositiveNumber(sideLength, "Enter the length of side2:");
            side3 = getPositiveNumber(sideLength, "Enter the length of side3:");
            if (side1 > 0 && side2 > 0 && side3 > 0) {
                break;
            }
            System.out.println("Invalid input! Please enter positive numbers for all sides.");
        }
        sideLength.close();

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        String formattedArea = String.format("%.2f", area);
        System.out.println("Area of the triangle is " + formattedArea);
    }

    private static double getPositiveNumber(Scanner scanner, String prompt) {
        double number;
        do {
            System.out.println(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            number = scanner.nextDouble();
            if (number <= 0) {
                System.out.println("Invalid input! Please enter a positive number.");
            }
        } while (number <= 0);
        return number;
    }
}