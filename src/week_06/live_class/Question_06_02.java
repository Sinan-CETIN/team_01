package week_06.live_class;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long number = input.nextLong();

        System.out.println("Sum of all digits ->  " + sumDigit(number));
    }

    public static int sumDigit(long number) {
        String n = number + ""; // 4229  == "4229"
        int sum = 0;
        System.out.println(n.length());

        for (int i = 0; i < n.length(); i++) {
            int digit  = n.charAt(i) - '0'; // '9' - '0'= 9

            System.out.println(digit);
            sum += digit;
        }
        return sum;
    }
}
