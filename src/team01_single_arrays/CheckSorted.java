package week_01;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array first number (indicates size)");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The list is" + (isSorted(arr) ? " already " : " not ") + " sorted");
    }

    public static boolean isSorted(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                return false;
//            }
//        }
//        return true;
    }
}
