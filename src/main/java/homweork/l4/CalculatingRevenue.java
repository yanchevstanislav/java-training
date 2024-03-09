package main.java.homweork.l4;

import java.util.Scanner;

public class CalculatingRevenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity of the product sold: ");
        int quantity;
        while (true) {
            if (scanner.hasNextInt()) {
                quantity = scanner.nextInt();
                break;
            } else {
                System.out.println("Error! Please enter a whole number: ");
                scanner.next();
            }
        }

        System.out.println("Enter the unit price of the product: ");
        double unitPrice;
        while (true) {
            if (scanner.hasNextDouble()) {
                unitPrice = scanner.nextDouble();
                break;
            } else {
                System.out.println("Error! Please enter a number: ");
                scanner.next();
            }
        }

        double revenueBeforeDiscount = unitPrice * quantity;

        double discountRate;
        if (quantity < 100) {
            discountRate = 0.0;
        } else if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else {
            discountRate = 0.20;
        }

        double revenueAfterDiscount = revenueBeforeDiscount * (1 - discountRate);

        System.out.println("Revenue before discount: €" + revenueBeforeDiscount);
        System.out.println("Discount rate: " + (discountRate * 100) + "%");
        System.out.println("Discount: €" + (revenueBeforeDiscount * discountRate));
        System.out.println("Revenue after discount: €" + revenueAfterDiscount);
    }
}