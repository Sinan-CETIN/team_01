package week_06.exercise;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
       int result = 0;
       int count = (number + "").length() - 1;
       while(number > 0) {
           result += number % 10 * Math.pow(10, count);
           number /= 10;
           count--;
       }
        System.out.println(result);


    }
}
