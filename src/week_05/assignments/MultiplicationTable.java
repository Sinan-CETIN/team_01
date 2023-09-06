package week_05.assignments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        System.out.printf("%3s"," ");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%3d",i);
        }
        System.out.println("\n------------------------------");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " |");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }
    }
}
