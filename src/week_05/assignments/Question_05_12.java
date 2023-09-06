package week_05.assignments;

import java.util.Scanner;

public class Question_05_12 {
    public static void main(String[] args) {
        int number = 1;
        while (Math.pow(number, 2) < 12000) {
            number++;
        }
        System.out.println("The smallest n is -> " + number);
    }
}
