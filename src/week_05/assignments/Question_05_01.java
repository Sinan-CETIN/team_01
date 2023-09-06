package week_05.assignments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPositiveNumbers = 0;
        int numberOfNegativeNumbers = 0;
        int total = 0;
        int number;
        do {
            System.out.print("Enter an integer, input ends if it is 0 : ");
            number = input.nextInt();
            if (number != 0) {
                if (number > 0) {
                    numberOfPositiveNumbers++;
                } else {
                    numberOfNegativeNumbers++;
                }
                total += number;
            }
        } while (number != 0);


        if (numberOfPositiveNumbers + numberOfNegativeNumbers == 0) {
            System.out.println("You did not enter any number!");
        } else {
            System.out.println("The number of positive is " + numberOfPositiveNumbers);
            System.out.println("The number of negative is " + numberOfNegativeNumbers);
            System.out.println("The total is " + total);
            System.out.println("The average is " + (total / (numberOfNegativeNumbers + numberOfPositiveNumbers)));
        }

    }
}
