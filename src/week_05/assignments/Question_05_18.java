package week_05.assignments;

public class Question_05_18 {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            System.out.print("| ");
            // pattern A numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Pattern A blanks spaces
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("  ");
            }
            System.out.print(" | ");
            // Pattern B numbers
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");

            }
            // pattern B blank spcaes
            for (int j = 7 - i; j < 6; j++) {
                System.out.print("  ");
            }
            System.out.print(" | ");
            // blank spaces for C
            for (int j = 1; j < 7 - i; j++) {
                System.out.print("  ");
            }
            // number for Pattern C
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print(" | ");
            // number for pattern D
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");

            }
            // blank spaces for pattern D
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(" |");
        }
    }
}
