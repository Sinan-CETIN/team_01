package multi_dimensional_array;

import java.util.Arrays;

public class Question_08_19 {
    public static void main(String[] args) {
        int[][] array = createArray(8);
        display(array);
        System.out.println("Mathrix has" + (hasFourConsecutiveNumber(array) ? " " : " not ") + "consecutive numbers.");
    }

    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static int[][] createArray(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 3);
            }
        }
        return result;
    }

    public static boolean hasFourConsecutiveNumber(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (hasConsecutiveInTheRow(array, i, j)) {
                    System.out.println("ROW start index -> (" + i + ", " + j + ")");
                    return true;
                }
                if (hasConsecutiveInColumn(array, i, j)) {
                    System.out.println("COLUMN start index -> (" + i + ", " + j + ")");
                    return true;
                }
                if (hasConsecutiveInDiagonal(array, i, j)) {
                    System.out.println("DIAGONAL start index -> (" + i + ", " + j + ")");
                    return true;
                }
                if (hasConsecutiveInSubDiagonal(array, i, j)) {
                    System.out.println("SUBDIAGONAL start index -> (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasConsecutiveInTheRow(int[][] array, int startRow, int startColumn) {
        if (startColumn + 4 > array[0].length) {
            return false;
        }

        for (int i = startColumn; i < startColumn + 3; i++) {
            if (array[startRow][i] != array[startRow][i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean hasConsecutiveInColumn(int[][] array, int startRow, int startColumn) {
        if (startRow + 4 > array.length) {
            return false;
        }

        for (int i = startRow; i < startRow + 3; i++) {
            if (array[i][startColumn] != array[i + 1][startColumn]) {
                return false;
            }
        }

        return true;
    }

    public static boolean hasConsecutiveInDiagonal(int[][] array, int startRow, int startColumn) {
        if (startRow + 4 > array.length) {
            return false;
        }
        if (startColumn + 4 > array[0].length) {
            return false;
        }

        for (int i = startRow, j = startColumn; i < startRow + 3; i++,j++) {
            if (array[i][j] != array[i + 1][j + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean hasConsecutiveInSubDiagonal(int[][] array, int startRow, int startColumn) {
        if (startRow + 4 > array.length) {
            return false;
        }
        if (startColumn < 3) {
            return false;
        }

        for (int i = startRow, j = startColumn; i < startRow + 3; i++, j--) {
            if (array[i][j] != array[i + 1][j - 1]) {
                return false;
            }
        }
        return true;
    }
}
