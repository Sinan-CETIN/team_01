package week_01;

import java.util.Arrays;

public class SearchComparison {
    public static void main(String[] args) {
        int[] arr = createArray(10000000);
        long startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Sorted time -> " +  executionTime);

        int key = 9999999;
        System.out.println("Key -> " + key);

         startTime = System.currentTimeMillis();
        int index = linearSearch(arr, key);
         endTime = System.currentTimeMillis();

         executionTime = endTime - startTime;

        System.out.println("Execution for linear -> " + executionTime);
        System.out.println("index -> " + index);
        System.out.println("\n");

        startTime = System.currentTimeMillis();
        index = Arrays.binarySearch(arr, key);
        endTime = System.currentTimeMillis();

        executionTime = endTime - startTime;

        System.out.println("Execution for binary -> " + executionTime);
        System.out.println("index -> " + index);

    }

    public static int[] createArray(int number) {
        int[] result = new int[number];

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * number);
        }
        return result;
    }

    public static int getKey(int number) {
        return (int) (Math.random() * number);
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(key < arr[i]){
                return -1;
            }
            if (key == arr[i]) {
                return i;
            }

        }
        return -1;
    }
}
