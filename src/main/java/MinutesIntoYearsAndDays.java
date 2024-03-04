package main.java;

import java.util.Scanner;
public class MinutesIntoYearsAndDays {
    public static void main(String[] args) {

        Scanner givenMinutes = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        double minutes = givenMinutes.nextDouble();

        givenMinutes.close();

        double minutesInYear = 365 * 24 * 60;
        double minutesInDay = 24 * 60;

        double years = minutes / minutesInYear;
        double remainingMinutes = minutes % minutesInYear;

        double days = remainingMinutes / minutesInDay;

        System.out.println((int) minutes + " minutes are approximately " + (int) years + " years and " + (int) days + " days.");
    }
}
