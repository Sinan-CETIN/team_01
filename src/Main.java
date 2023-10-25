import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = createArray(5, 5);
        displayArray(array);
        turnArray(array);
        displayArray(array);
    }

    public static int[][] createArray(int row, int column) {
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[row][column] = (int) (Math.random() * 9 + 1);
            }
        }
        return result;
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void turnArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            int m = row;
            for (int column = row; column < array[row].length - row; column++) {
                int temp = array[row][column];
                



            }
        }
    }
}