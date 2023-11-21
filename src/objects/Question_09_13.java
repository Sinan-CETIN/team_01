package objects;

import java.util.Arrays;

public class Question_09_13 {

    public static void main(String[] args) {

        int[][] array = createArray(10);
        Location location = getLargestLocation(array);
        displayArray(array);
        System.out.println(location);
    }

    public static int[][] createArray(int size) {
        int[][] result = new int[size][size];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int)(Math.random() * 100);
            }
        }
        return result;
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static Location getLargestLocation(int[][] array) {
        int maxValue = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxColumn = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]) {
                    maxRow = i;
                    maxColumn = j;
                    maxValue = array[i][j];
                }
            }
        }

        return new Location(maxRow,maxColumn,maxValue);
    }
}
