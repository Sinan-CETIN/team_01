package multi_dimensional_array;


import java.util.Arrays;

public class Question_08_13 {
    public static void main(String[] args) {
        double[][] array = createArray(10, 5);
        int[] largestElementLocation = getLocationOfLargestElement(array);
        display(array);
        displayMessage(largestElementLocation);
    }

    public static void display(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static double[][] createArray(int row, int column) {
        double[][] result = new double[row][column];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 500) / 10.0;
            }
        }
        return result;
    }


    public static int[] getLocationOfLargestElement(double[][] array) {
        double max = Integer.MIN_VALUE;
        int maxRowIndex = -1;
        int maxColumnIndex = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    maxRowIndex = i;
                    maxColumnIndex = j;
                }
            }
        }
        return new int[]{maxRowIndex, maxColumnIndex};
    }

    public static void displayMessage(int[] location) {
        System.out.println("The largest Element location is (" + location[0] + ", " + location[1] + ")");
    }

}
