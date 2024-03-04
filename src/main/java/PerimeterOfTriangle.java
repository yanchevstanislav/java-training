package main.java;

import java.util.Scanner;
public class PerimeterOfTriangle {
    public static void main(String[] args) {

        Scanner sideLength = new Scanner(System.in);

        double side1, side2, side3;

        while (true) {
            System.out.println("Enter the length of side1: ");
            side1 = Double.parseDouble(sideLength.next());
            if (side1 > 0) {
                break;
            }
            System.out.println("Invalid input! Please enter a positive number for the side.");
        }
        while (true) {
            System.out.println("Enter the length of side2: ");
            side2 = Double.parseDouble(sideLength.next());
            if (side2 > 0) {
                break;
            }
            System.out.println("Invalid input! Please enter a positive number for the side.");
        }
        while (true) {
            System.out.println("Enter the length of side3: ");
            side3 = Double.parseDouble(sideLength.next());
            if (side3 > 0) {
                break;
            }
            System.out.println("Invalid input! Please enter a positive number for the side.");
        }
        sideLength.close();


            double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle is " + perimeter);
        }
    }
