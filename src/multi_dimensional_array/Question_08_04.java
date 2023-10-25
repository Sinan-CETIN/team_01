package multi_dimensional_array;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee number ->");
        int employeeNumber = input.nextInt();

        int[][] employeeWorkHour = new int[employeeNumber][7];
        fillWorkHour(input, employeeWorkHour);
        displayWorkHour(employeeWorkHour);

    }

    public static void displayWorkHour(int[][] workHour) {
        int[][] employeeWorkHour = new int[workHour.length][2];

        for (int i = 0; i < workHour.length; i++) {
            int sum = 0;

            for (int j = 0; j < workHour[i].length; j++) {

                sum += workHour[i][j];
            }
            employeeWorkHour[i][0] = i;
            employeeWorkHour[i][1] = sum;
        }

        sort(employeeWorkHour);

        display(employeeWorkHour);
    }

    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Employee " + array[i][0] + "'s total work hour is " + array[i][1]);
        }
    }

    public static void sort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i][1];
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (max < array[j][1]) {
                    max = array[j][1];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                // swap work hour
                int temp = array[i][1];
                array[i][1] = array[maxIndex][1];
                array[maxIndex][1] = temp;
                // swap name
                temp = array[i][0];
                array[i][0] = array[maxIndex][0];
                array[maxIndex][0] = temp;
            }
        }
    }

    public static void fillWorkHour(Scanner input, int[][] workHour) {
        for (int i = 0; i < workHour.length; i++) {
            System.out.println("Enter work hour for employee " + i + " -> ");
            for (int j = 0; j < workHour[i].length; j++) {
                workHour[i][j] = (int)(Math.random() * 10);
                System.out.print(workHour[i][j] + " ");//input.nextInt();
            }
            System.out.println();
        }
    }
}

