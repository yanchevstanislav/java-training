package main.java.homework.l6;

import java.util.Scanner;

public class MiddleCharacter {
    public static String middleCharacters(String str) {
        int length = str.length();
        int middleIndex = length / 2;

        String middleChars;
        if (length % 2 == 0) {
            middleChars = str.substring(middleIndex - 1, middleIndex + 1);
        } else {
            middleChars = str.substring(middleIndex, middleIndex + 1);
        }
        return middleChars;
    }

    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1 = stringInput.nextLine();

        stringInput.close();

        System.out.println("String: \"" + str1 + "\"");

        String middleChars = middleCharacters(str1);
        int wordCount = countWords(str1);

        System.out.println("Middle character(s) of the string: " + middleChars);
        System.out.println("Number of words in the string: " + wordCount);
    }
}