package week_01;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students -> ");
        int numOfStudents = input.nextInt();

        int[] scoresArray = new int[numOfStudents];
        String[] namesArray = new String[numOfStudents];

        takeScores(scoresArray, namesArray);
        displayResultInDecreasingOrder(scoresArray, namesArray);
    }

    public static void takeScores(int[] scoresArr, String[] nameArr) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < scoresArr.length; i++) {
            System.out.print("Enter student name -> ");
            nameArr[i] = input.nextLine();
            System.out.println("Enter student scores -> ");
            scoresArr[i] = input.nextInt();
            input.nextLine();
        }
    }

    public static void displayResultInDecreasingOrder(int[] scoresArr, String[] namesArr) {
        sort(scoresArr, namesArr);
        for (int i = namesArr.length - 1; i >= 0; i--) {
            System.out.println("Name -> " + namesArr[i] + " | Scores -> " + scoresArr[i]);
        }
    }

    public static void sort(int[] scoresArr, String[] namesArr) {
        for (int i = 0; i < scoresArr.length - 1; i++) {
            int min = scoresArr[i];
            int minIndex = i;
            for (int j = i + 1; j < scoresArr.length; j++) {
                if (min > scoresArr[j]) {
                    min = scoresArr[j];
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                // swap scores
                scoresArr[minIndex] = scoresArr[i];
                scoresArr[i] = min;

                // swap names index -> i and minIndex
                String temp = namesArr[i];
                namesArr[i] = namesArr[minIndex];
                namesArr[minIndex] = temp;
            }
        }
    }
}
