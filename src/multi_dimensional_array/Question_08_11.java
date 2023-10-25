package multi_dimensional_array;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
//        int number = getNumberFromTheUser();
        for (int i = 0; i < 512; i++) {
            System.out.println("Table -> " + i);
            displayTailOrHeadTable(i);
            System.out.println("\n");
        }

    }

    public static int getNumberFromTheUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 512 : ");
        int number = input.nextInt();
        while (0 <= number && number > 512) {
            System.out.print("Invalid input!Number must be between 0 and 512.Re-enter your number :");
            number = input.nextInt();
        }
        return number;
    }

    public static void displayTailOrHeadTable(int number) {
        String strOfNumber = getStrOfNumber(number);
        for (int i = 0; i < 9; i++) {
            if ((i + 1) % 3 == 0) {
                if (strOfNumber.charAt(i) == '0') {
                    System.out.println("H");
                } else {
                    System.out.println("T");
                }
            } else {
                if (strOfNumber.charAt(i) == '0') {
                    System.out.print("H ");
                } else {
                    System.out.print("T ");
                }
            }
        }
    }

    public static String getStrOfNumber(int number) { //"10101"
        StringBuilder result = new StringBuilder();
        while (number != 0) {
            result.insert(0, number % 2);
            number /= 2;
        }

        while(result.toString().length() != 9) {
            result.insert(0,'0');
        }
        return result.toString();
    }
}
