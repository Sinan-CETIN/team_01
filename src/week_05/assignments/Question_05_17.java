package week_05.assignments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines - > ");
        int numberOfLines = input.nextInt();

        for (int satir = 1; satir <= numberOfLines; satir++) {
            // print blank spaces
            for (int i = 1; i <= numberOfLines - satir; i++) {
                System.out.print("  ");
            }

            // print first numbers
            for (int i = satir; i > 1 ; i--) {
                System.out.print(i + " ");
            }

            // print seconds numbers
            for (int i = 1; i <= satir; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
