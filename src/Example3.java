public class Example3 {
    public static void main(String[] args) {
        int[] array = new int[8];
        method(array);
        displayArray(array);

    }

    public static void method(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 50);
        }
    }

    public static int[] createArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * (92 - 63)) + 63;
        }
        return result;
    }

    // {1,2 ,4, 54, 234}
    public static void displayArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("}");
    }

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
