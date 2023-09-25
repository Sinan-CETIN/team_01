package week_06.live_class;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // input 2 numbers from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1 : ");
        int number1 = input.nextInt();
        System.out.print("Enter number2 : ");
        int number2 = input.nextInt();

        // display the greatest common divisor
        System.out.println("The greatest common divisor for " +
                number1 + " and " + number2 + " is " + gcd(number1, number2));
    }


    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int divisor = 2;
        while (divisor <= Math.min(n1, n2)) {
            if (n1 % divisor == 0 && n2 % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        }
        return gcd;
    }
}
