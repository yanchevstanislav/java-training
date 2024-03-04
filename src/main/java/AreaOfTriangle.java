package main.java;

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner sideLength = new Scanner(System.in);

        System.out.println("Enter the length of side1:");
        double side1 = sideLength.nextDouble();

        System.out.println("Enter the length of side2:");
        double side2 = sideLength.nextDouble();

        System.out.println("Enter the length of side3:");
        double side3 = sideLength.nextDouble();

        sideLength.close();

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s- side1) * (s- side2) * (s- side3));

        System.out.println("Area of the triangle is "+ area);

    }
}
