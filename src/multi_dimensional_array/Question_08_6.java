package multi_dimensional_array;

public class Question_08_6 {
    public static void main(String[] args) {
        int[][] array = createArray(10);
        display(array);
        sort(array);
        display(array);
    }

    public static int[][] createArray(int numberOfList) {
        int[][] result = new int[numberOfList][2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 10);
            }
        }
        return result;
    }

    public static void display(int[][] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{" + array[i][0] + ", " + array[i][1] + "}");
            if (i == array.length - 1) {
                System.out.println("}");
            } else {
                System.out.print(", ");
            }
        }
    }

    public static void sort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int minRow = array[i][0];
            int minColumn = array[i][1];
            for (int j = i + 1; j < array.length; j++) {
                if (minRow > array[j][0]) {
                    minIndex = j;
                    minRow = array[j][0];
                    minColumn = array[j][1];
                }
                if (minRow == array[j][0] && minColumn > array[j][1]) {
                    minIndex = j;
                    minColumn = array[j][0];
                }
            }

            if (minIndex != i) {
                int[] temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
