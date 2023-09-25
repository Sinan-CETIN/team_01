package week_06.live_class;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long number = input.nextLong();

        System.out.println("The approximated square root of " + number + " is : " + ((int)(sqrt(number) * 100) / 100.0));
    }

    public static double sqrt(long number) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + number / lastGuess) / 2;

        while (Math.abs(nextGuess - lastGuess) > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + number / lastGuess) / 2;
        }


        return nextGuess;
    }
}
