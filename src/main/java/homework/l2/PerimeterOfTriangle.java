package main.java.homework.l2;

import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner sideLength = new Scanner(System.in);

        double side1 = 0.0, side2 = 0.0, side3 = 0.0;

        boolean validTriangle = false;

        while (!validTriangle) {
            while (true) {
                System.out.println("Enter the length of side1: ");
                side1 = Double.parseDouble(sideLength.next());
                if (side1 > 0) {
                    break;
                }
                System.out.println("Invalid input! Please enter a positive number for side1.");
            }
            while (true) {
                System.out.println("Enter the length of side2: ");
                side2 = Double.parseDouble(sideLength.next());
                if (side2 > 0) {
                    break;
                }
                System.out.println("Invalid input! Please enter a positive number for side2.");
            }
            while (true) {
                System.out.println("Enter the length of side3: ");
                side3 = Double.parseDouble(sideLength.next());
                if (side3 > 0) {
                    break;
                }
                System.out.println("Invalid input! Please enter a positive number for side3.");
            }

            if (isValidTriangle(side1, side2, side3)) {
                validTriangle = true;
            } else {
                System.out.println("Invalid triangle! Try again.");
            }
        }
        sideLength.close();

        double perimeter = side1 + side2 + side3;
        System.out.printf("Perimeter of the triangle is %.2f\n", perimeter);
    }

    private static boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
}