package week_05.assignments;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = input.nextInt();
        System.out.println("Enter first day of year 1 for Monday 2 for tuesday : ");
        int firstDay = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            int numberOfDayInMonth = 0;
            // display calender header
            switch (i) {
                case 1:
                    System.out.print("January");
                    numberOfDayInMonth = 31;
                    break;
                case 2:
                    System.out.print("February");
                    numberOfDayInMonth = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
                    firstDay += 31;
                    break;
                case 3:
                    System.out.print("March");
                    numberOfDayInMonth = 31;
                    firstDay += ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
                    break;
                case 4:
                    numberOfDayInMonth = 30;
                    System.out.print("April");
                    firstDay += 31;
                    break;
                case 5:
                    numberOfDayInMonth = 31;
                    System.out.print("May");
                    firstDay += 30;
                    break;
                case 6:
                    numberOfDayInMonth = 30;
                    System.out.print("June");
                    firstDay += 31;
                    break;
                case 7:
                    numberOfDayInMonth = 31;
                    System.out.print("July");
                    firstDay += 30;
                    break;
                case 8:
                    numberOfDayInMonth = 31;
                    System.out.print("August");
                    firstDay += 31;
                    break;
                case 9:
                    numberOfDayInMonth = 30;
                    System.out.print("September");
                    firstDay += 31;
                    break;
                case 10:
                    numberOfDayInMonth = 31;
                    System.out.print("October");
                    firstDay += 30;
                    break;
                case 11:
                    numberOfDayInMonth = 30;
                    System.out.print("November");
                    firstDay += 31;
                    break;
                case 12:
                    numberOfDayInMonth = 31;
                    System.out.print("December");
                    firstDay += 30;
                    break;
            }
            System.out.print(", " + year);
            System.out.println("\n--------------------------");
            System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

            // display calendar body
            // start the calendar first day according to the first day variable

            // bosluklari koyalim
            for (int j = 0; j < firstDay % 7; j++) {
                System.out.printf("%5s", "");
            }

            // start writing numbers
            for (int j = 1; j <= numberOfDayInMonth; j++) {
                if ((firstDay + j) % 7 == 0) {
                    System.out.printf("%-5d\n", j);
                } else {
                    System.out.printf("%-5d", j);
                }
            }
            System.out.println("\n");
        }
    }
}
