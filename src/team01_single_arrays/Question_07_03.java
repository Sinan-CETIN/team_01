package team01_single_arrays;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 - 10 if you enter 0 imput ends : ");
        int number = input.nextInt();
        int[] countOfNumbers = new int[10];

        int[] numbersArray = new int[10];
        int index = 0;
        while (number != 0) {
            numbersArray[index++] = number;
            countOfNumbers[number - 1]++;
            number = input.nextInt();
        }

        displayCount(countOfNumbers);

    }

    public static void displayCount(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((i + 1) + " occurs " + arr[i] + " " + ((arr[i] > 1) ? "times" : "time"));
            }
        }
    }
}
