package main.java.homework.l5;

public class SumArrayNumbers {
    public static void main(String[] args) {

        int[] array = {9,27,39,14,11};

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements is: "+ sum);
            }
}
