package multi_dimensional_array;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        int[][] matrix1 = createMatrix(9, 2);
        int[][] matrix2 = createMatrix(2, 3);
        int[][] matrix3 = multiplyMatrix(matrix1, matrix2);
        displayResult(matrix1, matrix2, matrix3);
    }

    public static int[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);
        int[][] result = new int[row][column];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 9) + 1;
            }

        }
        return result;
    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Invalid input!");
            System.exit(1);
        }

        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void displayResult(int[][] matrix1, int[][] matrix2, int[][] matrix3) {
        System.out.println("the multiplication of matrices is -> ");
        int maxRow = Math.max(matrix1.length, matrix2.length);
        for (int i = 0; i < maxRow; i++) {
            displayRow(i, matrix1);

            if (maxRow / 2 == i) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }

            displayRow(i, matrix2);

            if (maxRow / 2 == i) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }

            displayRow(i, matrix3);
            System.out.println();
        }

    }

    public static void displayRow(int row, int[][] matrix) {

        if (matrix.length <= row) {
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.printf("%4s", " ");
            }
            return;
        }

        for (int i = 0; i < matrix[row].length; i++) {
            System.out.printf("%4d", matrix[row][i]);
        }
    }
}
