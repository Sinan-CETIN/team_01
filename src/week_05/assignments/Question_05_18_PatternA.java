package week_05.assignments;

public class Question_05_18_PatternA {
    public static void main(String[] args) {
        // Pattern A
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
