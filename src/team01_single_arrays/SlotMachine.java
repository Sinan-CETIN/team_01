package week_01;

import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of balls");
        int numberOfBalls = input.nextInt();

        System.out.println("Enter the number of slot in the machine : ");
        int numberOfSlots = input.nextInt();

        int[] slotsArr = new int[numberOfSlots];

        dropBalls(numberOfBalls, slotsArr);
        displayResult(slotsArr);
    }

    public static void dropBalls(int numOfBalls, int[] slots) {


        for (int i = 0; i < numOfBalls; i++) {
            String ballPattern = "";
            int slotNum = 0;
            for (int j = 0; j < slots.length - 1; j++) {
                if (isRight()) {
                    ballPattern += "R ";
                    slotNum++;
                } else {
                    ballPattern += "L ";
                }
            }
            System.out.println(ballPattern + " slot number -> " + (slotNum + 1));
            slots[slotNum]++;
        }
    }

    private static boolean isRight() {
        return (int) (Math.random() * 2) == 1;
    }

    public static void displayResult(int[] arr) {
        int max = findMax(arr);

        for (int i = max; i > 0; i--) {
            System.out.print("|");
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] >= i) {
                    System.out.print("0|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("--");
        }

        System.out.print("\n|");
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(i + "|");
        }
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
