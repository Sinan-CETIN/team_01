package multi_dimensional_array;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of rows ->");
        int numberOfRow = input.nextInt();
        int[][] matrix = getMatrix(numberOfRow, input);

        //  index0 = row ,  index1 = column, index2  = size
        int[] maximumSquare = getMaximumSquare(matrix);

//        displayArray(matrix);
        displaySquareInfo(maximumSquare);
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("row" + i + "->");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displaySquareInfo(int[] arr) {
        if (arr[0] == -1) {
            System.out.println("the matrix dont have any 1!");
        } else {
            if (arr[2] == 1) {
                System.out.println("There is no square!");
            } else {
                System.out.println("The maximum square submatix is (" + arr[0] + ", "
                        + arr[1] + ") with size " + arr[2]);
            }
        }

    }

    public static int[][] getMatrix(int size, Scanner input) {
        int[][] result = new int[size][size];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextInt();
            }
        }
        return result;
    }

    public static int[] getMaximumSquare(int[][] array) {
        int[] result = new int[3];
        result[0] = -1;
        result[1] = -1;
        int maxSize = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                while (hasSquare(array, i, j, maxSize)) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = maxSize;
                    maxSize++;
                }
            }
        }
        return result;
    }

    public static boolean hasSquare(int[][] array, int row, int column, int maxSize) {
        if (row + maxSize > array.length) {
            return false;
        }
        if (column + maxSize > array[0].length) {
            return false;
        }

        for (int i = row; i < row + maxSize; i++) {
            for (int j = column; j < column + maxSize; j++) {
                if (array[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
