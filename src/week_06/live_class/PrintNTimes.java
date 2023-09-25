package week_06.live_class;

import java.util.*;

public class PrintNTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the message -> ");
        String message = input.nextLine();
        System.out.print("How many times do you want to display message -> ");
        int number = input.nextInt();

        System.out.println("Message displayed " + printNTimes(message, number) + " times");
    }


    public static int printNTimes(String str, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " --> " + str);
            if (i == 10) {
                return 10;
            }
        }

        return number;
    }
}
