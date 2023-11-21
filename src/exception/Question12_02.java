package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        boolean isContinue = true;
        System.out.println("Enter a integer number and display it -> ");
        do {
            try {
                number = input.nextInt();
                isContinue = false;
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.println("Input mismatched.Please re-enter an int variable ->");
                number = -1;
            }
        } while (isContinue);
        System.out.println("Number -> " + number);
    }
}

