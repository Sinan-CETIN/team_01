package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {
        System.out.println("The first 100 pentagol numbers, ten per lines :");
        printPentagolNumbers(49);
    }

    public static void printPentagolNumbers(int number) {
        final int NUM_PER_LINE = 10;
        final int NUMBER_OF_PENTAGOL = number;

        for (int i = 1; i <= NUMBER_OF_PENTAGOL; i++) {
            System.out.printf("%7d", calculatePentagol(i));
            if (i % NUM_PER_LINE == 0) {
                System.out.println();
            }
        }
    }

    public static int calculatePentagol(int number) {
        return number * (3 * number - 1) / 2;
    }
}
