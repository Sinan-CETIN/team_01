package week_06.live_class;

import java.util.Scanner;

public class NPrintLn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the message : ");
        String message = input.nextLine();

        System.out.print("Enter the repetition of the message : ");
        int n = input.nextInt();

        nPrintln(message, n);

        System.out.println("---------------");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " -> " + message);
        }

    }

    public static void nPrintln(String message, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println((i + 1) + " -> " + message);
        }
    }
}
