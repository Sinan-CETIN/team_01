package multi_dimensional_array;

public class Example {
    public static void main(String[] args) {
        double[][] array = createArray(5, 5);
        displayArray(array);
        double[] sum = Question_08_01.sumAllTheColumns(array);
        System.out.println("Sum ->");
        Question_08_01.displayResult(sum);

        System.out.println("\n----------------\n");

        sortArrayRow(array);
        displayArray(array);
        sum =  Question_08_01.sumAllTheColumns(array);
        System.out.println("Sum ->");
        Question_08_01.displayResult(sum);

    }

    public static double[][] createArray(int row, int column) {
        double[][] result = new double[row][column];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = Math.random() * 100;
            }
        }

        return result;
    }

    public static void displayArray(double[][] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.printf("%.2f, ", array[i][j]);
                }else {
                    System.out.printf("%.2f", array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.println("}");
            } else {
                System.out.print("}");
            }

        }
        System.out.println("}");
    }

    public static void sortArrayRow(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            sort(array[i]);
        }
    }

    public static void sort(double[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            double min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                double temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }

        }
    }
}
