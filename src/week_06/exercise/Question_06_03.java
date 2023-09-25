package week_06.exercise;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        System.out.println(number + " is" + (isPalindrome(number) ? "" : " not") + " a palindrome");
    }

    public static boolean isPalindrome(int number) {
        int reverseOfNumber = reverse(number);
        return reverseOfNumber == number;
    }

    public static int reverse(int number) {
        String numberAsString = number + "";
        String reverseNumber = "";
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            reverseNumber += numberAsString.charAt(i);
        }

        return Integer.parseInt(reverseNumber);
    }
}
