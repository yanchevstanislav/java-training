package main.java.homweork.l4;

public class ReverseList {
    public static void main(String[] args) {
        int[] list1 = {10, 20, 30, 40, 50};

        System.out.println("Original list:");
        for (int num : list1) {
            System.out.print(num + " ");
        }
        System.out.println("\nReversed list:");
        for (int i = list1.length - 1; i >= 0; i--) {
            System.out.print(list1[i] + " ");
        }
    }
}
