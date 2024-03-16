package main.java.homework.l5;

public class ArrayBiggestElement {
    public static void main(String[] args) {
        
        int[] array = {2,8,23,12,34,11,3};

        int biggestNumber =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggestNumber){
                biggestNumber = array[i];
            }
            
        }
        System.out.println("The biggest number is: "+ biggestNumber);
    }
}
