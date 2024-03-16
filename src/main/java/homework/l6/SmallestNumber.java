package main.java.homework.l6;

public class SmallestNumber {
    public static int findSmallest(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 9;
        int num3 = 32;

        int smallest = findSmallest(num1, num2, num3);

        System.out.println("The smallest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + smallest);
    }
}
