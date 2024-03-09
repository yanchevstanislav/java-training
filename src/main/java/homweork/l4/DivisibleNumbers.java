package main.java.homweork.l4;

public class DivisibleNumbers {
    public static void main(String[] args) {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int num : list1) {
            if (num > 150) {
                break;
            }
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }
    }
}