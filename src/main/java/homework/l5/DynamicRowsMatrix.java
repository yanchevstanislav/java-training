package main.java.homework.l5;

import java.util.Scanner;
public class DynamicRowsMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the desired number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the desired number of columns:");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the desired number for position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }

        }
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}


