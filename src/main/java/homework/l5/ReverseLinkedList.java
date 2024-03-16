package main.java.homework.l5;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        for (int i = 0; i < numbers.size() / 2; i++) {

            int temp = numbers.get(i);

            numbers.set(i, numbers.get(numbers.size() - i - 1));

            numbers.set(numbers.size() - i - 1, temp);
        }

        System.out.println(numbers);
    }
}
