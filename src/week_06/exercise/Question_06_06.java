package week_06.exercise;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = input.nextInt();
        displayPattern(row);
    }

    public static void displayPattern(int numberOfRows) {
        String numberAsString = numberOfRows + "";
        int length = numberAsString.length();
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = numberOfRows - i; j > 0; j--) {
                System.out.printf("%" + (length + 1) + "s", "");
            }

            for (int j = 1; j <= i; j++) {
                System.out.printf("%" + (length + 1) + "d", j);
            }
            System.out.println();
        }
    }
}
