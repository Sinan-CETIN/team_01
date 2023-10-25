package multi_dimensional_array;

import java.util.Arrays;

public class Question_08_01 {
    public static void main(String[] args) {
        double[][] array = createArray(4, 5);
        displayArray(array);

        double[] sumOfColumn = sumAllTheColumns(array);
        displayResult(sumOfColumn);
    }

    public static double[][] createArray(int row, int column) {
        double[][] result = new double[row][column];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 100) / 10.0;
            }
        }
        return result;
    }

    public static void displayArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static double[] sumAllTheColumns(double[][] array) {
        double[] result = new double[array[0].length];

        for (int i = 0; i < array[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            result[i] = sum;
        }

        return result;
    }

    public static void displayResult(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sum of the elements in column " + i + " is " + array[i]);

        }
    }

}
