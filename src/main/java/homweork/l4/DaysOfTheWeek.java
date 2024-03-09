package main.java.homweork.l4;

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");

        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            String dayOfWeek = switch (dayNumber) {
                case 1 -> "Sunday";
                case 2 -> "Monday";
                case 3 -> "Tuesday";
                case 4 -> "Wednesday";
                case 5 -> "Thursday";
                case 6 -> "Friday";
                case 7 -> "Saturday";
                default -> "Unknown day";
            };

            System.out.println("The " + dayNumber + getSuffix(dayNumber) + " day of the week is " + dayOfWeek);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
    public static String getSuffix(int num) {
        if (num >= 11 && num <= 13) {
            return "th";
        }

        return switch (num % 10) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }
}