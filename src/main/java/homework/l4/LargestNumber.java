package main.java.homework.l4;

public class LargestNumber {
    public static void main(String[] args) {

        int[] arr = {7,14,25,34,54,123,32,2};
        int largestNumber = arr[0];
        int i;

        for (i=1; i <arr.length; i++) {

            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}
