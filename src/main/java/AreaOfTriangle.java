package main.java;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sideLength = new Scanner(System.in);

        double side1 = 0.0, side2 = 0.0, side3 = 0.0;

        boolean validTriangle = false;

        while (!validTriangle) {
            while (true) {
                System.out.println("Enter the length of side1:");
                side1 = getPositiveNumber(sideLength);
                if (side1 > 0) {
                    break;
                }
                System.out.println("Invalid input! Please enter a positive number for side1.");
            }

            while (true) {
                System.out.println("Enter the length of side2:");
                side2 = getPositiveNumber(sideLength);
                if (side2 > 0) {
                    break;
                }
                System.out.println("Invalid input! Please enter a positive number for side2.");
            }

            while (true) {
                System.out.println("Enter the length of side3:");
                side3 = getPositiveNumber(sideLength);
                if (side3 > 0) {
                    break;
                }
                System.out.println("Invalid input! Please enter a positive number for side3.");
            }

            if (isValidTriangle(side1, side2, side3)) {
                validTriangle = true;
            } else {
                System.out.println("Invalid triangle! The sum of any two sides must be greater than the third side. Try again.");
            }
        }
        sideLength.close();

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.printf("Area of the triangle is %.2f\n", area);
    }

    private static double getPositiveNumber(Scanner scanner) {
        double number;
        do {
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

    private static boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
}