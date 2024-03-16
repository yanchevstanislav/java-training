package main.java.homework.l6;

public class CalculateAverage {
    public static double calcAverage(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double num1 = 27.24;
        double num2 = 32.11;
        double num3 = 11.23;

        double average = calcAverage(num1, num2, num3);
        String formattedAverage = String.format("%.2f", average);
        System.out.println("The average of :" + num1 + ", " + num2 + ", and " + num3 + " is " + formattedAverage);
    }
}
