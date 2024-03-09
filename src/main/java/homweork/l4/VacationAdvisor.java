package main.java.homweork.l4;

import java.util.Scanner;

public class VacationAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Vacation Advisor!");
        System.out.println("Choose the type of vacation: Beach or Mountain");
        String vacationType = scanner.nextLine();

        if (vacationType.equalsIgnoreCase("Beach") || vacationType.equalsIgnoreCase("Mountain")) {
            System.out.println("Enter your budget per day per person: ");
            double budgetPerDay = scanner.nextDouble();

            if (vacationType.equalsIgnoreCase("Beach")) {
                if (budgetPerDay < 50) {
                    System.out.println("Based on your budget, you should consider vacationing in Bulgaria.");
                } else {
                    System.out.println("Based on your budget, you should consider vacationing outside Bulgaria.");
                }
            } else {
                if (budgetPerDay < 30) {
                    System.out.println("Based on your budget, you should consider vacationing in Bulgaria.");
                } else {
                    System.out.println("Based on your budget, you should consider vacationing outside Bulgaria.");
                }
            }
        } else {
            System.out.println("Sorry, there is no information about this type of vacation.");
        }
    }
}